package com.ikaimen.pattern.ProxyPattern.demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ChenTao on 2017/7/15.
 * 动态代理类
 */
public class GamePlayIH implements InvocationHandler {

    //被代理者
    Class aClass = null;
    //被代理的实例
    Object object = null;

    //我要代理谁
    public  GamePlayIH(Object object){

        this.object = object;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(this.object,args);
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在用我的账号登录！");
        }

        return result;
    }
}
