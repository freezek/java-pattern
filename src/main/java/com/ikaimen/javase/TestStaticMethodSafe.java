package com.ikaimen.javase;

import sun.tools.jconsole.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName TestStaticMethodSafe
 * @Description TODO
 * @Author chentao
 * @Date 2019/8/2 2:14 PM
 * @ModifyDate 2019/8/2 2:14 PM
 * @Version 1.0
 */
public class TestStaticMethodSafe {


    private static List<Integer> integerList = new ArrayList<>();

    private static String  deadLock = "";

    public static void main(String[] args) {

      FutureTask futureTask =  new FutureTask<>(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return "abc";
            }
        });

//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                for (int i = 0; i < 10 ; i++) {
//                    deadLock = "def"+i;
//                }
//            }
//        });

        try {
            futureTask.run();
            System.out.println(        futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        //  thread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(deadLock);

    }

    private static void test() throws InterruptedException {
        System.out.println("hello");
        Thread.sleep(1000);
    }
}
