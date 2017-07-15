package com.ikaimen.pattern.ProxyPattern.DynamlcProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by ChenTao on 2017/7/15.
 * 动态代理类
 */
public class DynamicProxy<T> {

    public static <T> T  newProxyInstance(ClassLoader loader,Class<?> [] interfaces ,InvocationHandler handler){

        //寻找连接点JoinPoint，AOP框架使用元素定义
        if(true){
            //执行一个前置通知
            new BeforeAdvice().exec();
        }

        //执行目标，并返回结果

        return (T) Proxy.newProxyInstance(loader,interfaces,handler);

    }

}
