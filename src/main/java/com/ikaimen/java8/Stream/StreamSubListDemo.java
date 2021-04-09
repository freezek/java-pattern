package com.ikaimen.java8.Stream;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName StreamSubListDemo
 * @Description
 * @Author Mr.Chen
 * @Date 2021/4/7 下午7:26
 * @Version V1.0
 **/
public class StreamSubListDemo {

    //切分后的子List size
    private static final Integer MAX_NUMBER = 2;

    @Test
    public void test() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int LIMIT = countStep(list.size());
        //方法一：使用并行流遍历操作
        List<List<Integer>> mglist = new ArrayList<>();
        Stream.iterate(0, n -> n + 1).limit(LIMIT).forEach(i -> {
            mglist.add(list.stream().skip(i * MAX_NUMBER).limit(MAX_NUMBER).collect(Collectors.toList()));
        });

        System.out.println(mglist);

        //方法二：获取分割后的集合
        List<List<Integer>> splitList = Stream.iterate(0, n -> n + 1).limit(LIMIT).parallel().map(a -> list.stream().skip(a * MAX_NUMBER).limit(MAX_NUMBER).parallel().collect(Collectors.toList())).collect(Collectors.toList());
    }

    /**
     * 计算切分次数
     */
    private static Integer countStep(Integer size) {
        Integer count = size / MAX_NUMBER;
        return size % 2 == 0 ? count : count + 1;
    }


    @Test
    public void testGuavaSublist() {
        //使用guava对list进行分割
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);
        //按每3个一组分割
        List<List<Integer>> parts = Lists.partition(lists, 1);

        CountDownLatch countDownLatch = new CountDownLatch(parts.size());

        List<Future<List<Integer>>> futures = Lists.newArrayList();

        List<Integer> results = Lists.newArrayList();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (List<Integer> list:parts) {
            Future<List<Integer>> future = executorService.submit(() -> {

                List<Integer> collect = list.stream().map(integer -> integer + 5).collect(Collectors.toList());
                Thread.sleep(19);
                countDownLatch.countDown();
                return collect;

            });
            futures.add(future);

        }

        try {
            countDownLatch.await(20,TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Future<List<Integer>> future:futures) {

            if(future.isDone()){
                List<Integer> integers = null;

                try {
                    integers = future.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }

                results.addAll(integers);

            }
        }

        System.out.println(results.toString());


    }
}
