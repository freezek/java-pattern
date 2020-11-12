package com.ikaimen.javase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DirtyDataInThreadLocal {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    public static void main(String[] args) {
        // 使用固定大小为1的线程池,说明上一个的线程属性会被下一个线程属性复用
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            Mythead mythead = new Mythead();
            pool.execute(mythead);
        }
    }

    private static class Mythead extends Thread{
        private static boolean flag = true;

        @Override
        public void run() {
            if (flag){
                // 第一个线程set后,并没有进行remove
                // 而第二个线程由于某种原因没有进行set操作
                threadLocal.set(this.getName()+", session info.");
                //flag = false;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(this.getName()+" 线程是 "+threadLocal.get());
            threadLocal.remove();
            // 但是由于ThreadLocal没有在线程处理结束时及时进行remove清理操作
            // 在高并发场景下,线程池中的线程属性会被下一个线程属性复用
        }
    }
}
