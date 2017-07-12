package com.ikaimen.pattern.FactoryPattern.AbstractFactory;

/**
 * Created by Tom Chen on 2017/7/7.
 * 产品A1
 */
public class ProductA1 extends  AbstractProductA {
    @Override
    public void doSomeThing() {
        System.out.println("产品A1的方法！");
    }
}
