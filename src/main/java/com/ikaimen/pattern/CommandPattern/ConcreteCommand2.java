package com.ikaimen.pattern.CommandPattern;

/**
 * Created by ChenTao on 2017/7/29.
 * 具体的Command 类
 */
public class ConcreteCommand2 extends Command{

    //对哪个接收者进行命令处理

    private Receiver receiver;

    public ConcreteCommand2(){

        super(new ConcreteReciver2());
    }

    @Override
    public void execute() {
        super.receiver.doSomething();

    }
}
