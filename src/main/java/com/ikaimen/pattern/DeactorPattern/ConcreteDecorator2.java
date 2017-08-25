package com.ikaimen.pattern.DeactorPattern;

/**
 * Created by ChenTao on 2017/8/25.
 *
 * 具体装饰者
 *
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    //定义自己的装饰方法

    public void method2(){

        System.out.println("method2 修饰");
    }

    //重写父类的Operate方法

    @Override
    public void operate(){

        super.operate();

        this.method2();
    }
}
