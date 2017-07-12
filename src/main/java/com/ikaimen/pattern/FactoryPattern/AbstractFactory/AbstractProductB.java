package com.ikaimen.pattern.FactoryPattern.AbstractFactory;

/**
 * Created by Tom Chen on 2017/7/7.
 * 抽象产品类
 */
public abstract class AbstractProductB {

    //每个产品的共有方法
    public void shareMethod(){
    }
    //每个产品的相同方法不同实现
    public abstract void  doSomeThing();

}
