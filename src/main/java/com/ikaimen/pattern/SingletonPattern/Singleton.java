package com.ikaimen.pattern.SingletonPattern;

/**
 * Created by Tom Chen on 2017/7/7.
 * 单例模式实现一：该实现可能会出现多线程生成多个实例的情况
 * 在Java中创建对象通常有两种方式，第一，通过new关键字进行中创建，第二，通过实现Cloneable接口实现 java默认是不可以复制的，并且通过复制方式创建对象并不是通过构造器进行实例化的
 * 修正，还可以通过java反射生成实例，前提是对象存在；
 */
public class Singleton {

    private static volatile Singleton singleton = null;

    private Singleton(){};

    public static synchronized Singleton getInstance(){
        //如果多线程，线程A刚执行到判断，CPU调度了线程Ｂ那么　就会出现在内存中出现多个实例的情况。解决办法，在方法前加上synchronize关键字或者在执行函数里面增加synchronize实现
        if(singleton==null){
          singleton = new Singleton();
        }
        return singleton;
    }

    public static  Singleton getSingleton(){
        //如果多线程，线程A刚执行到判断，CPU调度了线程Ｂ那么　就会出现在内存中出现多个实例的情况。

        if(singleton==null)
            synchronized(Singleton.class){
                {
                    singleton = new Singleton();
                }
            }
        return singleton;
    }

}
