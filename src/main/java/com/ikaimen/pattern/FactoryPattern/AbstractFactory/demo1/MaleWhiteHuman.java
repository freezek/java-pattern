package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 白色人种男性
 */
public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白种人：男");

    }
}
