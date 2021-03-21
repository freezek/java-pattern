package com.ikaimen.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {

    public static void main(String[] args) throws InterruptedException{

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 7, 1000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(1000));

        Worker worker = new Worker();
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.submit(worker);
        }

        threadPoolExecutor.shutdownNow();
        System.out.println("");
        threadPoolExecutor.notify();
        threadPoolExecutor = new ThreadPoolExecutor(4, 7, 1000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(10));

        for (int i = 0; i < 100; i++) {
            threadPoolExecutor.submit(worker);
        }

        Thread.sleep(100000);

    }

    static class Worker implements  Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
