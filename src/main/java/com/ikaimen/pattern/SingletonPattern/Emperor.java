package com.ikaimen.pattern.SingletonPattern;

/**
 * Created by Tom Chen on 2017/7/7.
 * 单例模式的优缺点：
 * 优点：节约内存资源，减少资源开销，避免多个实例对同一资源的写操作，可以设计全局访问点
 * 缺点：单例模式没有接口对扩展不利，单例模式在生产环境中不利于测试，单例模式与单一职责原则相冲突
 */
public class Emperor {

    private static  final Emperor emperor = new Emperor();//初始化一个皇帝

    private Emperor(){
        //世俗和道德的约束，让这个世界只存在一个皇帝！
    }

    public static Emperor getInstance(){
        return emperor;
    }

    public  static void say(){

        System.out.println("我是王。。。");

    }

}
