package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo4;

import java.lang.reflect.Constructor;

/**
 * Created by ChenTao on 2017/7/9.
 * 负责生成单例的工厂类
 */
public class SingletonFactory {

    private static  Singleton singleton;
    static {

        try {
            Class c  = Class.forName(Singleton.class.getName());
            //获得无参数构造器
            Constructor constructor = c.getDeclaredConstructor();
            //设置无参构造是可以访问的
            constructor.setAccessible(true);
            //生产一个实例对象
            singleton = (Singleton) constructor.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static  Singleton getSingleton(){

        return singleton;
    }

}
