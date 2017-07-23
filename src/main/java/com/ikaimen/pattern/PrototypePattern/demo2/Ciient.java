package com.ikaimen.pattern.PrototypePattern.demo2;

/**
 * Created by ChenTao on 2017/7/23.
 * 简单的场景类
 *
 *
 * 注意：Object 类的clone方法的原理是从内存中（具体的说是堆内存）以二进制流的方式进行拷贝，重新分配一个内存体，那构造函数没有执行也是非常正常的了。
 */
public class Ciient {

    public static void main(String[] args) {

        //产生一个对象
        Thing thing = new Thing();

        //拷贝一个对象

        Thing cloneThing = (Thing) thing.clone();

    }

}
