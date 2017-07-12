package com.ikaimen.pattern.FactoryPattern.AbstractFactory;

/**
 * Created by ChenTao on 2017/7/8.
 * 产品A1 的工厂实现类
 */
public class Creator1 extends AbstractCreator{

    //只生产产品登记为1的A产品
    @Override
    public AbstractProductA createProductA() {
        return  new ProductA1();
    }

    //只生产产品等级为1的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

}
