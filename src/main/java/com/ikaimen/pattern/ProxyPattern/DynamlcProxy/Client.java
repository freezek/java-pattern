package com.ikaimen.pattern.ProxyPattern.DynamlcProxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by ChenTao on 2017/7/15.
 * 动态代理场景类
 */
public class Client {

    public static void main(String[] args) {

        //定义一个主题

        Subject subject = new RealSubject();

        //定义一个handel

        InvocationHandler handler  = new MyInvocationHandler(subject);

        //定义主题的代理

        Subject proxy = SujectDynamicProxy.newProxyInstance(subject);

        //代理的行为

        proxy.doSomething("Finish!");

    }
}
