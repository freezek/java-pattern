package com.ikaimen.pattern.FactoryPattern.AbstractFactory;

/**
 * Created by ChenTao on 2017/7/8.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {

        //定义两个工厂
        //生产等级1的工厂
        AbstractCreator creator1 = new Creator1() ;
        //生产等级2的工厂
        AbstractCreator creator2 = new Creator2();

        //生产等级为1 的A产品

        AbstractProductA a1 = creator1.createProductA();
        a1.doSomeThing();

        //生产等级为2 的A产品

        AbstractProductA a2 = creator2.createProductA();
        a2.doSomeThing();


        //生产等级为1 的B产品

        AbstractProductB b1 = creator1.createProductB();
        b1.doSomeThing();

        //生产等级为2 的B产品

        AbstractProductB b2 = creator2.createProductB();
        b2.doSomeThing();
    }


}
