package com.ikaimen.pattern.ObserverPattern.demo1;

/**
 * Created by ChenTao on 2017/8/12.
 * 通过聚集方式实现观察者模式的场景类
 */
public class Client {


    public static void main(String[] args) {
        //定义出韩非子

        HanFeiZi hanFeiZi = new HanFeiZi();

        //然后我们看看韩非子在干什么

        hanFeiZi.haveBreakfast();

        hanFeiZi.haveFun();

    }

}
