package src.java;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Mr.Chen
 * @title:
 * @projectName com.ikaimen
 * @description: TODO
 * @date 2019/4/3  1:38 PM
 **/
public class MuiltThreadPool {



    // 定义线程池
    private static ExecutorService threadPool = null;
    //定义线程工厂
    private static ThreadFactory threadFactory = null;


    //开始时间
    private Date beginDate = null;
    //结束时间
    private Date endDate = null;
    //当前页
    private int page = 0;
    //每页条数
    private int limit = 10;

    //总页数
    private int totalPage = 0;

    //当前页
    private  static ThreadLocal<Integer> currentPage = new ThreadLocal<>();


    /**
     * 　　* @author Mr.Chen
     * 　　* @param []
     * 　　* @return void
     * 　　* @throws
     * 　　* @description: 初始化线程池
     * 　　* @date 2019/3/31   5:05 PM
     **/
    private static ExecutorService initThreadPool() {

        threadFactory = new ThreadFactoryBuilder()
                .setNameFormat("task-pool-%d").build();

        threadPool = new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(2048), threadFactory, new ThreadPoolExecutor.AbortPolicy());

        currentPage.set(0);

        System.out.println(currentPage.get()+"====");

        return threadPool;

    }


    private void doWhile(String tableName, int totalPages) {

        //定义Futura集合
        List<Future> futures = new ArrayList<>();
        //定义线程锁等线程池做完了任务再执行主线程
        CountDownLatch latch = new CountDownLatch(totalPages);

        //分页批量查询数据提交给线程池执行
        do {

            Future future = threadPool.submit(() -> {
                        synchronized (this) {
//                            for (int i=0;i<= totalPages; i++) {
                            System.out.println(currentPage);
                        }
                        //执行完任务调用锁的解锁方法
                        latch.countDown();
                    }
            );
            currentPage.set(currentPage.get() + 1);
            //每次提交完任务会产生一个新的future并添加到集合中
            futures.add(future);

        } while (currentPage.get() <= totalPages);

        try {
            //让主线程休眠
            latch.await();

            int fs = 0;
            for (Future f : futures) {
                if (f.isDone()) {
                    fs++;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(currentPage + "," + totalPages);
        currentPage.set(0);
        totalPage = 0;
    }


    /**
     * 　　* @author Mr.Chen
     * 　　* @param []
     * 　　* @return void
     * 　　* @throws
     * 　　* @description: 销毁对象回收内存 避免内存爆炸
     * 　　* @date 2019/3/31   6:05 PM
     **/
    private void distoryCacheSession() {


    }


    @Test
    public void testThreadPool() throws InterruptedException {



    }

    public static void main(String[] args) {

        initThreadPool();

        CountDownLatch _latch =  new CountDownLatch(1000);

        int  i = 0;

        do{

            int finalI = i;
            System.out.println(finalI);

            threadPool.submit(() -> {

                    System.out.println(finalI + "------");

                    currentPage.set(finalI);


                    System.out.println(Thread.currentThread().getName()+"***"+currentPage.get()+"****"+finalI);


            });

            //currentPage.set(currentPage.get().intValue()+1);
            i++;
            _latch.countDown();
        }while (i<=1000000);

        try {
            _latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


