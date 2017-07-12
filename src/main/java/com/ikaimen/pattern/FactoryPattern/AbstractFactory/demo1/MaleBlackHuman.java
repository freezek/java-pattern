package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 黑色人种男性
 */
public class MaleBlackHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("黑种人：男");

    }
}
