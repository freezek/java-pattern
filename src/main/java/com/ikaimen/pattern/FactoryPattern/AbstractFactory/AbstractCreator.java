package com.ikaimen.pattern.FactoryPattern.AbstractFactory;

/**
 * Created by ChenTao on 2017/7/8.
 * 、抽象工厂类
 */
public abstract class AbstractCreator {


    //创建A的产品家族
    public abstract  AbstractProductA createProductA();
    //创建B的产品家族
    public abstract  AbstractProductB createProductB();


}
