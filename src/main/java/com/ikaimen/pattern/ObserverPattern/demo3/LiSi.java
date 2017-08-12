package com.ikaimen.pattern.ObserverPattern.demo3;

import java.util.*;
import java.util.Observable;

/**
 * Created by ChenTao on 2017/8/12.
 * 具体观察者
 */
public class LiSi implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李四：观察到有活动，开始向老板汇报了。。。");

        this.reportToBoss(arg.toString());
    }

    //向老板汇报

    private void reportToBoss(String reportConext){

        System.out.println("李四：报告老板！韩非子有活动了----->" +reportConext);
    }
}
