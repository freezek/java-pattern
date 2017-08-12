package com.ikaimen.pattern.ObserverPattern.demo3;


import java.util.*;
import java.util.Observable;

/**
 * Created by ChenTao on 2017/8/12.
 * 被观察者实现类
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

    private boolean isNotify = true;

    //定义一个变长数组，存放所有的观察者
    private ArrayList<java.util.Observer> observables = new ArrayList<java.util.Observer>();

    @Override
    public void haveBreakfast() {

        System.out.println("韩非子：开始吃饭了。。。");
        super.setChanged();
        //通知所有观察者
        if(this.isNotify){
            this.notifyObservers("韩非子开始吃饭！");
        }


    }

    @Override
    public void haveFun() {

        System.out.println("韩非子：开始娱乐了。。。");
        super.setChanged();
        //通知所有观察者
        if(this.isNotify){
            this.notifyObservers("韩非子开始娱乐了。。。");
        }


    }

    @Override
    public void isNotify(boolean isNotify) {
         this.isNotify = isNotify;
    }


}
