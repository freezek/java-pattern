package com.ikaimen.pattern.MementoPattern;

/**
 * @Author: Mr.Chen
 *
 * @Description: 场景类
 *
 * @Date: Created in 2017/9/10 下午4:08
 **/
public class Client {

    public static void main(String[] args) {


        //定义出发起人

        Originator originator = new Originator();

        //定义备忘录管理员

        Caretaker caretaker = new Caretaker();

        //创造一个备忘录

        caretaker.setMemento(originator.createMemento());

        //恢复一个备忘录

        originator.restoreMemento(caretaker.getMemento());

    }

}
