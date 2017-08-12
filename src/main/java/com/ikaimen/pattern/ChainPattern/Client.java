package com.ikaimen.pattern.ChainPattern;

/**
 * Created by ChenTao on 2017/8/6.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {
        //声明所有的处理节点
        Handler handle1 = new ConcreteHander1();
        Handler handler2 = new ConcreteHander2();
        Handler handler3 = new ConcreteHander3();

        //设置链中的阶段顺序1----2---3
        handle1.setNext(handler2);

        handler2.setNext(handler3);

        Level level = new Level("2");

        //提交请求，返回结果
        Response response = handle1.handleMessage(new Request(level));
    }

}
