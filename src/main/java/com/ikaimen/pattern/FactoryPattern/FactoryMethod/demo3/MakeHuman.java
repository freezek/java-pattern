package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo3;

import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.BlackHuman;

/**
 * Created by Tom Chen on 2017/7/7.
 * 测试多工厂模式
 */
public class MakeHuman {

    public static void main(String[] args) {

        AbstractHumFactory factory = new BlackHumanFactory();
        BlackHuman blackHuman = (BlackHuman) factory.createHuman();
        blackHuman.getColor();
        blackHuman.talk();

    }
}
