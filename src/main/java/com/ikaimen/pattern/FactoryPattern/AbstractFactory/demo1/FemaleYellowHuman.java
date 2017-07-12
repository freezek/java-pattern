package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 黄色女性人种
 */
public class FemaleYellowHuman extends AbstracYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黄色人：女");
    }
}
