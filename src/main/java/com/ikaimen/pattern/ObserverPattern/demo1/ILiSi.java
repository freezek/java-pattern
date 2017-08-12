package com.ikaimen.pattern.ObserverPattern.demo1;

/**
 * Created by ChenTao on 2017/8/12.
 * 抽象观察者
 */
public interface ILiSi {

    //一发现别人有动静，自己也要行动起来
    public void update(String context);

}
