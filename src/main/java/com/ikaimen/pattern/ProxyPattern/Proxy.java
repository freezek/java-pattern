package com.ikaimen.pattern.ProxyPattern;

/**
 * Created by ChenTao on 2017/7/15.
 * 代理类
 */
public class Proxy implements Subject {
    //需要代理的实现类
    private  Subject subject = null;

    //默认被代理者
    public Proxy(){
        this.subject = new Proxy();
    }

    //通过构造函数传递代理者
    public  Proxy(Object ... objects){

    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();

    }

    //预处理
    private void before(){
        //do something
    }

    //善后处理

    private void after(){
        //do somethong
    }
}
