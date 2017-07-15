package com.ikaimen.pattern.ProxyPattern.DynamlcProxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by ChenTao on 2017/7/15.
 * 具体业务的动态代理
 */
public class SujectDynamicProxy extends DynamicProxy{


    public static <T> T newProxyInstance(Subject subject){

        //获得classLoader

        ClassLoader loader = subject.getClass().getClassLoader();

        //获得接口数组

        Class<?>[] classes = subject.getClass().getInterfaces();

        //获得Handel

        InvocationHandler handler = new MyInvocationHandler(subject);

        return newProxyInstance(loader,classes,handler);

    }

}
