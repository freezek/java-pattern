package com.ikaimen.pattern.PrototypePattern.demo4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChenTao on 2017/7/23.
 * 深拷贝--jdk 1.8 以后不支持了。。。
 *
 */
public class Thing implements Cloneable {

    //定义一个私有变量

    private List list = new ArrayList();

    @Override
    public Object clone()  {

        Thing thing = null ;

        try {
            thing = (Thing) super.clone();

//            this.list = this.list.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        return thing;
    }
}
