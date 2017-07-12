package com.ikaimen.pattern.TemplateMethodPattern.demo2;

/**
 * Created by ChenTao on 2017/7/9.
 * 悍马模型扩展
 */
public abstract class HummerModel {

    //启动
    protected  abstract  void start();
    //停止
    protected  abstract  void stop();
    //鸣号
    protected  abstract  void alarm();
    //引擎响
    protected  abstract void engineBoom();
    //上路
    final public  void run(){

        this.start();
        this.engineBoom();
        if(this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }
    //钩子函数，默认喇叭可以响
    protected  boolean isAlarm(){
        return true;
    }
}
