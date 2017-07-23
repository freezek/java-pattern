package com.ikaimen.pattern.PrototypePattern.demo3;

/**
 * Created by ChenTao on 2017/7/23.
 * 浅拷贝测试
 *
 * 注意：Object 提供的clone方法只是拷贝了对象本身，其内部的数据，引用对象等都不拷贝，还是指向原生对象的内部元素地址，这种拷贝就叫做浅拷贝。
 */
public class Client {

    public static void main(String[] args) {

        //产生一个对象
        Thing thing = new Thing();
        //设置一个值

        thing.setvalue("张三");

        //拷贝一个对象

        Thing cloneThing = (Thing) thing.clone();
        cloneThing.setvalue("李四");
        System.out.println(thing.getArrayList().toString());

    }

}
