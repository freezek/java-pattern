package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 黄种人的实现类
 */
public class YellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄种人：黄");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话的特点！");
    }
}
