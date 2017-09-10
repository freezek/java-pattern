package com.ikaimen.pattern.MementoPattern.demo2;

/**
 * @Author: Mr.Chen
 *
 * @Description:  融合备忘录的发起人角色
 *
 * @Date: Created in 2017/9/10 下午4:27
 **/
public class Originator implements Cloneable{

    private Originator backup ;

    //内部状态

    private String state = "";

    public String getState(){

        return  state;
    }

    public void setState(String state){

        this.state = state;
    }

    //创建一个备忘录

    public void createMementor()  {

       backup = this.clone();
    }


    //恢复一个备忘录

    public void restoreMemento(){

        this.setState(this.backup.getState());
    }

    //克隆当前对象

    @Override
    protected Originator clone(){

        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
