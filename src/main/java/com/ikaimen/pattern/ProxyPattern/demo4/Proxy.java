package com.ikaimen.pattern.ProxyPattern.demo4;

/**
 * Created by ChenTao on 2017/7/15.
 * 虚拟代理
 */
public class Proxy implements Subject{

    //需要代理代理的类
    private Subject subject;

    @Override
    public void request() {

        if(subject==null){
            subject = (Subject) new RealSubject();
        }
        subject.request();
    }
}
