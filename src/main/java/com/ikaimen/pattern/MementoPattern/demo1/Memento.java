package com.ikaimen.pattern.MementoPattern.demo1;

/**
 * @Author: Mr.Chen
 *
 * @Description: 备忘类
 *
 * @Date: Created in 2017/9/10 下午3:42
 **/
public class Memento {

    private  String state;



   public Memento(String state){

        this.state = state;
    }

    public String getState(){

        return this.state;
    }

    public void setState(String state){

        this.state = state;
    }

}
