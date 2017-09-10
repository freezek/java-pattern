package com.ikaimen.pattern.MementoPattern.demo3;


/**
 * @Author: Mr.Chen
 *
 * @Description:  场景类
 *
 * @Date: Created in 2017/9/10 下午5:16
 **/
public class Client {


    public static void main(String[] args) {

        //定义出发起人

        Originator originator = new Originator();

        //定义出备忘录管理员

        Caretaker caretaker = new Caretaker();

        //初始化

        originator.setState1("美国");

        originator.setState2("日本");

        originator.setState3("韩国");

        System.out.println("===初始化状态==="+originator);


        //创建一个备忘录

        caretaker.setMemento(originator.createMemento());

        //修改状态值

        originator.setState2("中国");

        originator.setState1("俄罗斯");

        originator.setState3("巴基斯坦");

        System.out.println("修改后的状态："+originator);

        //恢复一个备忘录

        originator.restoreMemento(caretaker.getMemento());

        System.out.println("恢复后的状态："+ originator);
    }

}
