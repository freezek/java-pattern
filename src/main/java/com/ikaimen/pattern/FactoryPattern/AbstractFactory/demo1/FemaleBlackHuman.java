package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 黑色女性人种
 */
public class FemaleBlackHuman extends AbstracBlackHuman{
    @Override
    public void getSex() {
        System.out.println("黑人：女");
    }
}
