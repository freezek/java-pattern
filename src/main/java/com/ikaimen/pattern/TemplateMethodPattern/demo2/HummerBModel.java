package com.ikaimen.pattern.TemplateMethodPattern.demo2;

/**
 * Created by ChenTao on 2017/7/9.
 * 型号B模型
 */
public class HummerBModel extends HummerModel{

    private boolean alarmFlag = false ;//性号B 不具有鸣号功能

    @Override
    protected void start() {
        System.out.println("型号B启动！");
    }

    @Override
    protected void stop() {
        System.out.println("型号B停止！");
    }

    @Override
    protected void alarm() {
        System.out.println("型号B鸣号！");
    }

    @Override
    protected void engineBoom() {
        System.out.println("型号B引擎响动！");

    }

    //默认不能鸣号
    protected  boolean isAlarm(){

        return  this.alarmFlag;
    }


}
