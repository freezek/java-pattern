package com.ikaimen.pattern.ObserverPattern.demo2;

/**
 * Created by ChenTao on 2017/8/12.
 * 具体观察者
 */
public class LiSi implements Observer{

    //观察行为
    @Override
    public void update(String context) {

        System.out.println("李四：观察到有活动，开始向老板汇报了。。。");

        this.reportToBoss(context);
    }

    //向老板汇报

    private void reportToBoss(String reportConext){

        System.out.println("李四：报告老板！韩非子有活动了----->" +reportConext);
    }
}
