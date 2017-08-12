package com.ikaimen.pattern.ObserverPattern;

/**
 * Created by ChenTao on 2017/8/12.
 * 具体被观察者
 */
public class ConcreteSubject extends Subject{

    //具体的业务

    public void doSomething(){

        super.notifyObservers();
    }
}
