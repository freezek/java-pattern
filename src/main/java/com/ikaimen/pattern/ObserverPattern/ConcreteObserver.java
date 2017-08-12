package com.ikaimen.pattern.ObserverPattern;

/**
 * Created by ChenTao on 2017/8/12.
 * 具体观察者
 */
public class ConcreteObserver implements Observer{

    //实现更新方法
    @Override
    public void update(){

        System.out.println("接收到信息，并进行处理！");
    }
}
