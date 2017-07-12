package com.ikaimen.pattern.SingletonPattern;

/**
 * Created by Tom Chen on 2017/7/7.
 */
public class Minister {//臣子类

    public static void main(String[] args) {
       for(int i=0;i<3;i++){
           Emperor emperor = Emperor.getInstance();
           emperor.say();//三天的请安都发现皇帝还是原来的皇帝
       }
    }
}
