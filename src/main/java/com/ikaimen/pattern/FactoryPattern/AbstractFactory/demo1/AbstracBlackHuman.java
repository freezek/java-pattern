package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 抽象白种人
 */
public abstract  class AbstracBlackHuman implements  Human {
    @Override
    public void getColor() {
        System.out.println("肤色：黑");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话的特点");

    }

}
