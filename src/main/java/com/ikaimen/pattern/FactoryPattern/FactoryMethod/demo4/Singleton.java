package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo4;

/**
 * Created by ChenTao on 2017/7/9.
 * 单例类
 */
public class Singleton {

    //不允许通过new生产一个对象
    private Singleton(){}

    public void doSomething(){

        System.out.println("处理业务");

    }
}
