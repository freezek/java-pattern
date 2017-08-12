package com.ikaimen.pattern.ObserverPattern;

import java.util.Vector;

/**
 * Created by ChenTao on 2017/8/12.
 * 被观察者
 */
public abstract class Subject {


    //定义一个观察者数组

    private Vector<Observer> observerVector = new Vector<Observer>();

    //增加一个观察者

    public void addObserver(Observer observer){

        this.observerVector.add(observer);
    }

    //删除有一个观察者

    public void delObserver(Observer observer){

        this.observerVector.remove(observer);
    }

    //通知所有观察者

    public void notifyObservers(){

        for (Observer observer :this.observerVector){

            observer.update();
        }

    }

}
