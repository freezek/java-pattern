package com.ikaimen.pattern.PrototypePattern.demo3;

import java.util.ArrayList;

/**
 * Created by ChenTao on 2017/7/23.
 *
 * 浅拷贝
 */
public class Thing implements Cloneable {

    //定义一个私有常量
    private ArrayList<String> arrayList = new ArrayList<String>();

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

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setvalue(String value) {
        this.arrayList.add(value);
    }
}
