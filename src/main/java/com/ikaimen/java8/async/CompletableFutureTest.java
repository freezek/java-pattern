package com.ikaimen.java8.async;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.core.NestedExceptionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * @ClassName CompletableFutureTest
 * @Description
 * @Author Mr.Chen
 * @Date 2021/3/26 上午11:42
 * @Version V1.0
 **/
public class CompletableFutureTest {

    @Test
    public void test() throws ExecutionException, InterruptedException {

        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(this::task1);
        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(this::task2);

        ArrayList<CompletableFuture<String>> futures = Lists.newArrayList();
        futures.add(task1);
        futures.add(task2);


        CompletableFuture<List<String>> sequence = this.sequence(futures);
        
        sequence.whenComplete((results,l) -> System.out.println(JSON.toJSON(results)));

        List<String> strings = sequence.get();

        System.out.println(JSON.toJSONString(strings));




    }

    private String task1(){
        System.out.println("task1");
        try {
            int i = 1 / 0;
        }catch (Exception e){
            System.out.println(NestedExceptionUtils.getRootCause(e));
        }
        return Thread.currentThread().getName();
    }

    private String task2(){
        System.out.println("task2");
        return Thread.currentThread().getName();
    }


    protected   <T> CompletableFuture<List<T>> sequence(List<CompletableFuture<T>> futures) {
        CompletableFuture<Void> allDoneFuture = CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]));
        return allDoneFuture.thenApply(v -> futures.stream().map(CompletableFuture::join).collect(Collectors.<T>toList()));
    }
}
