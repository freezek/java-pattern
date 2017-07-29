package com.ikaimen.pattern.CommandPattern;

/**
 * Created by ChenTao on 2017/7/29.
 * 调用者Invoker类
 */
public class Invoker {

    private Command command;

    //接受命令

    public void setCommand(Command command){

        this.command = command;
    }

    //执行命令

    public void action(){

        this.command.execute();

    }

}
