package com.ikaimen.pattern.StrategyPattern.demo1;

/**
 * @Author: Mr.Chen
 *
 * @Description: 策略三
 *
 * @Date: Created in 2017-08-27 下午3:05
 **/
public class BlockEnemy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("执行BlockEnemy策略！");
    }
}
