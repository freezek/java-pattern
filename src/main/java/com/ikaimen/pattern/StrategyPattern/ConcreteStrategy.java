package com.ikaimen.pattern.StrategyPattern;

/**
 * @Author: Mr.Chen
 * @Description:具体策略
 * @Date: Created in 2017-08-27 下午3:23
 **/
public class ConcreteStrategy implements Strategy {
    @Override
    public void doSomthing() {
        System.out.println("策略二的运算法则。。。。");
    }
}
