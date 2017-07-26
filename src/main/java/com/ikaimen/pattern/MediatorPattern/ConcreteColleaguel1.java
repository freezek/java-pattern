package com.ikaimen.pattern.MediatorPattern;

/**
 * Created by ChenTao on 2017/7/26.
 * 具体同事类
 */
public class ConcreteColleaguel1 extends Colleague{

    public ConcreteColleaguel1(Mediator mediator) {
        super(mediator);
    }

    //自有方法

    public void selfMethod1(){

        //处理自己的业务逻辑
    }

    //依赖方法

    public void deMethod1(){

        //处理自己的业务逻辑

        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomthing1();
    }
}
