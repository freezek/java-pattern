package com.ikaimen.pattern.TemplateMethodPattern.demo2;

/**
 * Created by ChenTao on 2017/7/9.
 * 型号A模型
 */
public class HummerAModel extends HummerModel{

    private boolean alarmFlag = true ;//性号A具有鸣号功能

    @Override
    protected void start() {
        System.out.println("型号A启动！");
    }

    @Override
    protected void stop() {
        System.out.println("型号A停止！");
    }

    @Override
    protected void alarm() {
        System.out.println("型号A鸣号！");
    }

    @Override
    protected boolean isAlarm() {
       return this.alarmFlag = alarmFlag;
    }

    @Override
    protected void engineBoom() {
        System.out.println("型号A引擎响动！");

    }



    public void setAlarm(boolean isAlarm){

        this.alarmFlag = isAlarm;
    }
}
