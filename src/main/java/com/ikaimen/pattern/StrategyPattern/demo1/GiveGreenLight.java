package com.ikaimen.pattern.StrategyPattern.demo1;

/**
 * @Author: Mr.Chen
 *
 * @Description: 策略二
 *
 * @Date: Created in 2017-08-27 下午3:02
 **/
public class GiveGreenLight implements IStrategy{
    @Override
    public void operate() {

        System.out.println("执行GiveGreenLight策略！");
    }
}
