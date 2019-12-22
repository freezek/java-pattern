package com.ikaimen.fastjson;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author chentao
 * @Date 2019/8/14 4:03 PM
 * @ModifyDate 2019/8/14 4:03 PM
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask task = new FutureTask<>(() -> "我是中国人");

        Thread thread = new Thread(task);

        thread.start();

        System.out.println(task.get());
    }

}
