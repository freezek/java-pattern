package com.ikaimen.pattern.VisitorPattern;


/**
 * @Author: Mr.Chen
 *
 * @Description: 抽象元素
 *
 * @Date: Created in 2017/9/24 下午6:40
 **/
public abstract class Elment {


    //定义业务逻辑

    public abstract void doSomthing();

    //允许谁来访问

    public abstract void accept(IVisitor visitor);

}
