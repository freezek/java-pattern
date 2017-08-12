package com.ikaimen.pattern.ObserverPattern;

/**
 * Created by ChenTao on 2017/8/12.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {


        //创建观察者

        Observer observer1 = new ConcreteObserver();

        Observer observer2 = new ConcreteObserver();

        Observer observer3 = new ConcreteObserver();

        Subject subject = new ConcreteSubject();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.notifyObservers();



    }
}
