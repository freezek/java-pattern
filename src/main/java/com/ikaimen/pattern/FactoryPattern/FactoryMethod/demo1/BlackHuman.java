package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 黑人的实现类
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人：黑");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话的特点！");
    }
}
