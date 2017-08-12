package com.ikaimen.pattern.ObserverPattern.demo3;


/**
 * Created by ChenTao on 2017/8/12.
 * 具体观察者
 */
public class WangWu implements java.util.Observer {

    //观察行为
    @Override
    public void update(java.util.Observable observable, Object context) {

        System.out.println("王五：观察到有活动，开始向老板汇报了。。。");

        this.reportToBoss(context.toString());
    }

    //向老板汇报

    private void reportToBoss(String reportConext){

        System.out.println("王五：报告老板！韩非子有活动了----->" +reportConext);
    }
}
