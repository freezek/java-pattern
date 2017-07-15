package com.ikaimen.pattern.ProxyPattern.DynamlcProxy;

/**
 * Created by ChenTao on 2017/7/15.
 * 真实主题
 */
public class RealSubject implements Subject {
    //业务操作
    @Override
    public void doSomething(String str) {
        System.out.println("do sonething!---->"+str);
    }
}
