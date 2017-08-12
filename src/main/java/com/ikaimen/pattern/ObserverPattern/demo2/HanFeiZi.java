package com.ikaimen.pattern.ObserverPattern.demo2;


import java.util.ArrayList;

/**
 * Created by ChenTao on 2017/8/12.
 * 被观察者实现类
 */
public class HanFeiZi implements Observable , IHanFeiZi{


    //定义一个变长数组，存放所有的观察者
    private ArrayList<Observer> observables = new ArrayList<Observer>();

    @Override
    public void haveBreakfast() {

        System.out.println("韩非子：开始吃饭了。。。");

        //通知所有观察者
        this.notifyObservers("韩非子开始吃饭！");

    }

    @Override
    public void haveFun() {

        System.out.println("韩非子：开始娱乐了。。。");

        //通知所有观察者
        this.notifyObservers("韩非子开始娱乐了。。。");

    }

    //增加观察者
    @Override
    public void addObserver(Observer observer) {

        this.observables.add(observer);

    }
    //删除观察者
    @Override
    public void deleteObserver(Observer observer) {

        this.observables.remove(observer);

    }
    //通知所有观察者
    @Override
    public void notifyObservers(String context) {

        for(Observer observer:observables){

            observer.update(context);
        }
    }
}
