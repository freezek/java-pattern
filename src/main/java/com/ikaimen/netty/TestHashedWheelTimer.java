package com.ikaimen.netty;

import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.Timer;
import io.netty.util.TimerTask;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestHashedWheelTimer
 * @Description TODO
 * @Author chentao
 * @Date 2019/8/27 2:35 PM
 * @ModifyDate 2019/8/27 2:35 PM
 * @Version 1.0
 */
public class TestHashedWheelTimer {

    static volatile boolean  isSuccess = false;

    static volatile int  time  = 1;

    static Timer timer = new HashedWheelTimer(10L, TimeUnit.MILLISECONDS,512);


    public static void main(String[] args) {

        System.out.println("开始重试时间：" + new Date());

        TimerTask task = new TimerTask() {
            @Override
            public void run(Timeout timeout) throws Exception {
                System.out.println("---run service-----" + new Date() + "-----" + time);
                //任务执行完成后再把自己添加到任务solt上
               // addTask(this);

               if( 3 == time) {

                   isSuccess = true;
               }

               if( 2 == time ){

                   addTaskThree(this);
               }

               if( 1 == time ){

                   for (int i = 0; i < 10000; i++) {
                       addTaskTwo(this);
                   }
               }

               time ++;
            }
        };
        addTaskOne(task);

    }

    public static void addTaskOne(TimerTask task){
        //根据时长把task任务放到响应的solt上
        timer.newTimeout(task,1,TimeUnit.MINUTES);
    }

    public static void addTaskTwo(TimerTask task){
        //根据时长把task任务放到响应的solt上
        timer.newTimeout(task,5,TimeUnit.MINUTES);
    }

    public static void addTaskThree(TimerTask task){
        //根据时长把task任务放到响应的solt上
        timer.newTimeout(task,10,TimeUnit.MINUTES);
    }

}
