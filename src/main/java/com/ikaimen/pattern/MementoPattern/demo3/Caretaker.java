package com.ikaimen.pattern.MementoPattern.demo3;


/**
 * @Author: Mr.Chen
 *
 * @Description:  备忘录管理角色
 *
 * @Date: Created in 2017/9/10 下午4:05
 **/
public class Caretaker {

    //备忘录对象

    private Memento memento;

    public Memento getMemento() {

        return memento;
    }

    public void setMemento(Memento memento){

        this.memento = memento;
    }
}
