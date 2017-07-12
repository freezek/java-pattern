package com.ikaimen.pattern.FactoryPattern.FactoryMethod;

/**
 * Created by ChenTao on 2017/7/8.
 * 抽象产品类
 */
public abstract class Product {

    //产品类的公共方法
    public void method(){
        System.out.println("我是产品的共有功能！");
    }

    //抽象的方法
    public abstract void method2();

}
