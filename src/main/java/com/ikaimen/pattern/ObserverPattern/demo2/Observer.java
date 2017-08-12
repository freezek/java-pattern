package com.ikaimen.pattern.ObserverPattern.demo2;

/**
 * Created by ChenTao on 2017/8/12.
 * 观察者接口
 */
public interface Observer {

    //一发现别人有动静，自己也要行动起来

    public void update(String context);
}
