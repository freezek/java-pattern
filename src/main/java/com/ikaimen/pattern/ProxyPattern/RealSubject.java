package com.ikaimen.pattern.ProxyPattern;

/**
 * Created by ChenTao on 2017/7/15.
 * 真实主题类
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        //业务处理逻辑
    }
}
