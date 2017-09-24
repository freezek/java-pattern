package com.ikaimen.pattern.VisitorPattern;


/**
 * @Author: Mr.Chen
 *
 * @Description:  具体元素
 *
 * @Date: Created in 2017/9/24 下午6:43
 **/
public class ConcreteElement2 extends Elment{

    //允许访问者访问

    @Override
    public void accept(IVisitor visitor) {

        visitor.visit(this);

    }

    //完善业务逻辑
    public void doSomthing(){

        //业务处理

        System.out.println("啦啦啦");

    }

}
