package com.ikaimen.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.ikaimen.log.Ylog;

import java.util.UUID;
import java.util.concurrent.*;

/**
 * @ClassName TestConcurrentModificationException
 * @Description TODO
 * @Author chentao
 * @Date 2019/6/28 5:27 PM
 * @ModifyDate 2019/6/28 5:27 PM
 * @Version 1.0
 */
public class TestConcurrentModificationException {


    private static Ylog ylog;

    public static void main(String[] args) throws InterruptedException {

        User user = new User();

//        user.setName("张三"+ UUID.randomUUID().toString());
//        user.setAge(18);

        ThreadFactory factory = new ThreadFactoryBuilder().setNameFormat("task-pool-%d").build();

        ExecutorService threadPool = new ThreadPoolExecutor(5, 20,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(12048), factory, new ThreadPoolExecutor.AbortPolicy());

        //CountDownLatch latch =  new CountDownLatch(3);
        //latch.await();
        for (int i = 0; i < 10000; i++) {
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    // ylog = new Ylog("a","b", UUID.randomUUID().toString());
                    user.setName("张三" + UUID.randomUUID().toString());
                    user.setAge(18);
                    System.out.println("********"+user);
                   // User user1 = (User) user.clone();
//                    System.out.println(user == user1);
//                    System.out.println(JSON.toJSONString(user1));
                }
            });
        }
        // latch.await();
    }

    static class Worker implements Runnable {
        @Override
        public void run() {

            ylog = new Ylog("a", "b", "c");

            System.out.println(JSON.toJSONString(ylog, SerializerFeature.SkipTransientField));

        }
    }

}
