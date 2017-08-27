package com.ikaimen.pattern.StrategyPattern.demo1;

/**
 * @Author: Mr.Chen
 *
 * @Description:策略使用场景类
 *
 * @Date: Created in 2017-08-27 下午3:10
 **/
public class Client {

    public static void main(String[] args) {

        Context context;

        System.out.println("------使用第一个策略-----");

        context = new Context(new BackDoor());

        context.operate();

        System.out.println("--------使用第二个策略-------");

        context = new Context(new GiveGreenLight());

        context.operate();

        System.out.println("-------使用第三个策略-------");

        context = new Context(new BlockEnemy());

        context.operate();
    }

}
