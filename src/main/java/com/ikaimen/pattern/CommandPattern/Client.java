package com.ikaimen.pattern.CommandPattern;

/**
 * Created by ChenTao on 2017/7/29.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {

        //首先声明调用者

        Invoker invoker = new Invoker();

        //定义接收者

        Receiver receiver = new ConcreteReciver1();

        //定义一个发送给接收者的命令

      //  Command command  = new ConcreteCommand1(receiver);
        //命令类封装接收者，高层模块不需要关心接收者是谁

        Command command = new ConcreteCommand1();

        //把命令交给调用者去执行

        invoker.setCommand(command);

        invoker.action();


    }

}
