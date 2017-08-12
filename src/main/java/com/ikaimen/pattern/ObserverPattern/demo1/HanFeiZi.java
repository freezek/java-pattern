package com.ikaimen.pattern.ObserverPattern.demo1;

/**
 * Created by ChenTao on 2017/8/12.
 * 具体被观察者
 */
public class HanFeiZi implements IHanFeiZi{

    //声明李四
    private ILiSi lisi = new LiSi();

//    //韩非子是否在吃饭，作为监控的判断标准
//    private boolean isHavingBreakfast = false;
//
//    //韩非子是否在娱乐
//    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {

        System.out.println("韩非子：开始吃饭了。。。");

        this.lisi.update("韩非子在吃饭！");

    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了。。。");

        this.lisi.update("韩非子在娱乐！");
    }


}
