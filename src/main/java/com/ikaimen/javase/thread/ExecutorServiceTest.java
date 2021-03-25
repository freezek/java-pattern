package com.ikaimen.javase.thread;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.*;

/**
 * @ClassName ExecutorServiceTest
 * @Description
 * @Author Mr.Chen
 * @Date 2021/3/25 上午9:49
 * @Version V1.0
 **/
public class ExecutorServiceTest {

    @Test
    public void test() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<CallableTask> tasks = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            tasks.add(new CallableTask());
        }

        List<Future<String>> futures = executorService.invokeAll(tasks, 1200, TimeUnit.MILLISECONDS);
        Thread.sleep(10000);
        futures.stream().forEach(future ->{

            if(future.isDone()){
                Object o = null;
                try {
                    if(future.isDone()){
                        o = future.get();
                        System.out.println("==="+o.toString());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (CancellationException e){

                    System.out.println( "task 被取消");
                }
            }
        });

        this.wait();

    }


}
