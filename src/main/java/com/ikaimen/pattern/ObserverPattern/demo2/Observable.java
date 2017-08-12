package com.ikaimen.pattern.ObserverPattern.demo2;

/**
 * Created by ChenTao on 2017/8/12.
 * 被观察者接口
 */
public interface Observable {

    //增加一个观察者
    public void addObserver(Observer observer);

    //删除一个观察者
    public void deleteObserver(Observer observer);

    //通知所有观察者
    public void notifyObservers(String context);

}
