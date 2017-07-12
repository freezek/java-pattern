package com.ikaimen.pattern.TemplateMethodPattern.demo1;

/**
 * Created by ChenTao on 2017/7/9.
 * 抽象悍马模型
 */
public abstract class HummerModel {

    //车子要能发动
    public  abstract  void start();
    //车子可以停下来
    public  abstract void stop();
    //喇叭会出声音，是滴滴叫，还是哔哔叫
    public  abstract  void  alarm();
    //启动后引擎会响
    public abstract void engineBoom();
    //模型会跑
    public void run(){

        //发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //起步前要鸣号
        this.alarm();
        //到达目的地停下
        this.stop();

    }

}
