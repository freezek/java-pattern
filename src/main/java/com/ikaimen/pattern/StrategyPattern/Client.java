package com.ikaimen.pattern.StrategyPattern;

/**
 * @Author: Mr.Chen
 *
 * @Description: 场景类
 *
 * @Date: Created in 2017-08-27 下午3:27
 **/
public class Client {

    public static void main(String[] args) {

        //声明一个具体的策略

        Strategy strategy = new ConcreteStrategy();

        //声明上下文

        Context context = new Context(strategy);

        //执行封装后的方法

        context.doAnything();

    }
}
