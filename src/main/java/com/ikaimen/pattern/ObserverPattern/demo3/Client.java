package com.ikaimen.pattern.ObserverPattern.demo3;

/**
 * Created by ChenTao on 2017/8/12.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {

        //实例化三个观察者

        LiSi lisi = new LiSi();

        WangWu wangwu = new WangWu();

        SunLiu  sunliu = new SunLiu();

        //定义出韩非子

        HanFeiZi hanFeiZi = new HanFeiZi();

        //显示控制是否进行通知
        //hanFeiZi.isNotify(false);

        //添加观察者

        hanFeiZi.addObserver(lisi);

        hanFeiZi.addObserver(wangwu);

        hanFeiZi.addObserver(sunliu);

        //韩非子开始行动

        hanFeiZi.haveBreakfast();

        hanFeiZi.haveFun();



    }

}
