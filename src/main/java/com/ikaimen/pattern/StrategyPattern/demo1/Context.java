package com.ikaimen.pattern.StrategyPattern.demo1;

/**
 * @Author: Mr.Chen
 *
 *
 * @Description:智囊团
 *
 * @Date: Created in 2017-08-27 下午3:07
 **/
public class Context {

    //构造函数，你要使用哪个策略

    private IStrategy strategy;

    public Context(IStrategy strategy){

        this.strategy = strategy;
    }

    //使用计谋了，看我出招了

    public void operate(){

        this.strategy.operate();
    }
}
