package com.ikaimen.javase;

import java.util.concurrent.*;

/**
 * @ClassName TestThreadLocal
 * @Description TODO
 * @Author chentao
 * @Date 2019/8/29 5:47 PM
 * @ModifyDate 2019/8/29 5:47 PM
 * @Version 1.0
 */
public class TestThreadLocal {

    private static ThreadLocal<String> local = new ThreadLocal<>();

    public static void main(String[] args) {

        try {
            local.set(Thread.currentThread().getName());

            Thread thread = new Thread(new Worker());
            Thread thread1 = new Thread(new Worker());
            Thread thread2 = new Thread(new Worker());

            thread.start();
            thread1.start();
            thread2.start();

            System.out.println(local.get()+"主方法");

            sayHello();
        }catch (Exception e){

            e.printStackTrace();
        }finally {
            local.remove();
        }

    }


    static class Worker implements Runnable{
        @Override
        public void run() {

            try {
                local.set(Thread.currentThread().getName());
                System.out.println(local.get()+"线程方法");
                sayHello();
            }catch (Exception e){

                e.printStackTrace();
            }finally {
                local.remove();
            }

        }
    }

    static private void sayHello(){

        System.out.println(local.get()+"链路方法");

        ScheduledExecutorService excutorService = Executors.newScheduledThreadPool(4);

        excutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延时执行");
            }
        },2,2, TimeUnit.SECONDS);

    }

}
