package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 人类抽象工厂
 */
public interface HumanFactory {
    //制造一个黄色人种
    public Human createYellowHuman();

    //制造一个白色人种
    public Human createWhiteHuman();

    //制造一个黑色人种
    public Human createBlackHuman();


}
