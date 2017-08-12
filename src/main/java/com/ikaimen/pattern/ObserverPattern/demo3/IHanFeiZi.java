package com.ikaimen.pattern.ObserverPattern.demo3;

/**
 * Created by ChenTao on 2017/8/12.
 * 被观察者接口
 */
public interface IHanFeiZi {

    //行为动作A
    public void haveBreakfast();

    //行为动作B
    public void haveFun();

    //是否进行通知
    public void isNotify(boolean isNotify);

}
