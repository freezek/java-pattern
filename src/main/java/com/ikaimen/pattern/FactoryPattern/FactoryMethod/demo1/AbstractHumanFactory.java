package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 抽象人类创建工厂
 */
public abstract class AbstractHumanFactory {

    public  abstract <T extends Human> T createHuman(Class<T> c);


}
