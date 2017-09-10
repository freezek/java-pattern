package com.ikaimen.pattern.MementoPattern.demo1;

/**
 * @Author: Mr.Chen
 *
 * @Description: 男孩状态类
 *
 * @Date: Created in 2017/9/10 下午3:29
 **/
public class Boy {

    //男孩状态
    private String state = " ";

    //认识女孩子后状态改变
    public void changeState(){

        this.state = "心情可能不太好";

    }

    public String getState(){

        return this.state;
    }

    public void setState(String state){

        this.state = state;
    }

    //保留一个备份
    public Memento createMemento(){

        return new Memento(this.state);
    }

    //保留一个备份

    public void restoreMemento(Memento _memento){

        this.setState(_memento.getState());

    }

}
