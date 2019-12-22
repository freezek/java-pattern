package com.ikaimen.fastjson;

import com.alibaba.fastjson.JSON;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Test
 * @Description TODO
 * @Author chentao
 * @Date 2019/7/30 11:42 PM
 * @ModifyDate 2019/7/30 11:42 PM
 * @Version 1.0
 */
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    private static int init = 0;

    private static Lock lock = new ReentrantLock();

    private static CountDownLatch downLatch = new CountDownLatch(1000);

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        logger.info("abc:", 1, 2, 3);

        int a = 0;

        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("thread-pool-%d").build();

        long start = System.currentTimeMillis();

        ExecutorService pool = new ThreadPoolExecutor(50, 100, 1000L,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(10000),
                threadFactory, new ThreadPoolExecutor.AbortPolicy());

        Worker worker = new Worker();

        do {
            int aInt = a;
            Future future = pool.submit(() -> {

                // WeakReference<int[]> arrays = new WeakReference<int[]>(new int[2000]);

                int[] arrays = new int[2000];

                System.out.println(Thread.currentThread().getName() + "我是独立执行的吗？" + "-----" + aInt + "-----" + arrays.length);
                downLatch.countDown();
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
           // future.get();
            a++;

        } while (a < 10000);

        downLatch.await();
        pool.shutdown();
        logger.info("循环总耗时：{}", System.currentTimeMillis() - start);
    }

    static class Worker implements Runnable {
        Integer count = init;

        @Override
        public void run() {
            synchronized (this) {
                try {
                    // lock.lock();


                    System.out.println(Thread.currentThread().getName() + "正在努力干活！" + "---" + count);
                    Thread.sleep(10L);
                    count++;
                    downLatch.countDown();

                    // lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
