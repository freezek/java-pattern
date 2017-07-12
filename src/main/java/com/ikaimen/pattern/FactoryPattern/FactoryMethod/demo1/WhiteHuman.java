package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 *
 * 白人人种实现类
 *
 */

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人：白");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话的特点！");
    }
}
