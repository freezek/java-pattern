package com.ikaimen.fastjson;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.BeanUtils;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author chentao
 * @Date 2019/7/4 3:51 PM
 * @ModifyDate 2019/7/4 3:51 PM
 * @Version 1.0
 */
public class Cat {

    static {
        System.out.println("猫的统称");
    }

    {
        System.out.println("cat");
    }

    public void voice(@NotNull String content){

        System.out.println("猫叫" + content);
    }

    public static void main(String[] args) throws InterruptedException {

        StringBuilder ab = new StringBuilder("ab");
        StringBuilder stringBuilder1 = new StringBuilder("");
        BeanUtils.copyProperties(ab,stringBuilder1);
        Thread thread1 = new Thread(new Worker(stringBuilder1));
        Thread thread2 = new Thread(new Worker(stringBuilder1));
        thread1.start();
        thread2.start();
        Thread.sleep(2000);
        System.out.println(ab.toString()+":"+ab.toString().length());
    }

     static class Worker implements Runnable{
        private StringBuilder stringBuilder;

        private Worker(StringBuilder stringBuilder){
            this.stringBuilder = stringBuilder;
        }
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (stringBuilder) {
                    stringBuilder.append("*");
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
