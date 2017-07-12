package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo3;

import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.Human;

/**
 * Created by Tom Chen on 2017/7/7.
 * 多工厂模式的工厂类
 */
public abstract class AbstractHumFactory {

    public abstract Human createHuman();

}
