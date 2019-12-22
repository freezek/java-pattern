package com.ikaimen.javase;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @ClassName TestMultThread
 * @Description TODO
 * @Author chentao
 * @Date 2019/8/7 1:47 PM
 * @ModifyDate 2019/8/7 1:47 PM
 * @Version 1.0
 */
public class TestMultThread {


    private static CountDownLatch countDownLatch = new CountDownLatch(10000);

    private static  int unit = 0 ;

    private static ThreadLocal local = new ThreadLocal();

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker(countDownLatch);

        ExecutorService pool = new ThreadPoolExecutor(6, 10, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(10000),
                new ThreadFactoryBuilder().setNameFormat("this-thread-%d").build(),
                new ThreadPoolExecutor.AbortPolicy());


        for (int i = 0; i < 10000; i++) {

           pool.submit(worker);

        }


        countDownLatch.await();


        System.out.println("主线程执行完成!");

        pool.shutdown();
    }


    static class Worker implements Runnable {

        private CountDownLatch countDownLatch;

        public Worker(CountDownLatch countDownLatch) {

            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            int i = 0;
            local.set(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + "------" + "计数器:" + i + "-----" + local.get());
            countDownLatch.countDown();

        }

    }


}
