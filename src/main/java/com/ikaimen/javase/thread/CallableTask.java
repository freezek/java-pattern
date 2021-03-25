package com.ikaimen.javase.thread;

import java.util.concurrent.Callable;

/**
 * @ClassName CallableTask
 * @Description
 * @Author Mr.Chen
 * @Date 2021/3/25 上午10:15
 * @Version V1.0
 **/
public class CallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        String name = Thread.currentThread().getName();
        System.out.println(name);
        return name;
    }
}
