package com.ikaimen.pattern.MementoPattern.demo2;

/**
 * @Author: Mr.Chen
 *
 * @Description: 场景类
 *
 * @Date: Created in 2017/9/10 下午4:40
 **/
public class Client {


    public static void main(String[] args) {

        //发起人定义

        Originator originator = new Originator();

        //建立初始状态

        originator.setState("初始状态。。。。");

        System.out.println("初始状态是："+originator.getState());

        //建立备份

        originator.createMementor();

        //修改后的状态

        originator.setState("修改后的状态。。。");

        System.out.println("修改后的状态是:"+originator.getState());

        //恢复原有状态

        originator.restoreMemento();

        System.out.println("恢复后的状态是："+ originator.getState());
    }


}
