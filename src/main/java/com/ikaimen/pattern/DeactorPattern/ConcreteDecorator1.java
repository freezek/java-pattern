package com.ikaimen.pattern.DeactorPattern;

/**
 * Created by ChenTao on 2017/8/25.
 * 具体的装饰类
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    //定义自己的修饰方法

    public void method1(){

        System.out.println(" method1 修饰 ");
    }

    //重写父类的Operate方法


    @Override
    public void operate(){

        this.method1();

        super.operate();

    }


}
