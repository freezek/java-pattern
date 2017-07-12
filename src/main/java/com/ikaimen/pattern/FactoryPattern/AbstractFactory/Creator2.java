package com.ikaimen.pattern.FactoryPattern.AbstractFactory;

/**
 * Created by ChenTao on 2017/7/8.
 *
 * 生产产品等级为2的工厂实现类
 *
 */
public class Creator2 extends AbstractCreator {

    //生产产品等级为2的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    //生产产品等级为2的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
