package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 黄色人种男性
 */
public class MaleYellowHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("黄种人：男");

    }
}
