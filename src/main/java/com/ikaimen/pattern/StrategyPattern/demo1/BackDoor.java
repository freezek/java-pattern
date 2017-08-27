package com.ikaimen.pattern.StrategyPattern.demo1;

/**
 * @Author: Mr.Chen
 *
 * @Description: 策略一
 *
 * @Date: Created in 2017-08-27 下午3:00
 *
 **/
public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("执行BackDoor策略！");
    }
}
