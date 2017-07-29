package com.ikaimen.pattern.CommandPattern.demo1;

/**
 * Created by ChenTao on 2017/7/29.
 * 增加一项需求
 */
public class Client {


    public static void main(String[] args) {

        //定义我们的接头人
        Invoker jack = new Invoker();

        //客户要求增加一项需求

        System.out.println("--------客户要求增加需求--------");

        //客户下达命令

        Command command = new AddRequirementCommand();

        //接头人收到命令

        jack.setCommand(command);

        //执行命令

        jack.action();

        System.out.println("-------------客户要求删除一个页面-------------");

        Command delCommand = new DeletePageCommand();

        jack.setCommand(delCommand);

        jack.action();

    }

}
