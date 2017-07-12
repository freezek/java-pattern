package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 抽象白种人
 */
public abstract  class AbstracYellowHuman implements  Human {
    @Override
    public void getColor() {
        System.out.println("肤色：黄");
    }

    @Override
    public void talk() {
        System.out.println("黄种】人说话的特点");

    }

}
