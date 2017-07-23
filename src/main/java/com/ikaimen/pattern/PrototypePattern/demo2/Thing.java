package com.ikaimen.pattern.PrototypePattern.demo2;

/**
 * Created by ChenTao on 2017/7/23.
 * 简单的可以拷贝对象
 */
public class Thing implements Cloneable {

    public Thing(){
        System.out.println("执行构造函数。。。");
    }

    @Override
    public Object clone()  {

        Thing thing = null;

        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
