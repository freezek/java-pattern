package com.ikaimen.pattern.MementoPattern.demo2;

/**
 * @Author: Mr.Chen
 *
 * @Description: 备忘录管理员角色
 *
 * @Date: Created in 2017/9/10 下午4:35
 **/
public class Caretaker {

    // 发起人的对象

    private Originator originator;

    public Originator getOriginator() {

        return originator;
    }

    public void setOriginator(Originator originator){

        this.originator = originator;
    }
}
