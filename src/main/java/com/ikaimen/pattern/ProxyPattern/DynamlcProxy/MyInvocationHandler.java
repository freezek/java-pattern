package com.ikaimen.pattern.ProxyPattern.DynamlcProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ChenTao on 2017/7/15.
 * 动态代理handler类
 */
public class MyInvocationHandler implements InvocationHandler{

    //被代理的对象
    private Object target = null;

    //通过构造函数传递一个对象
    public MyInvocationHandler(Object o){

        this.target = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
