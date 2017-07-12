package com.ikaimen.pattern.TemplateMethodPattern;

/**
 * Created by ChenTao on 2017/7/9.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {

        AbstractClass abstractClassA = new ConcreateClassA();

        AbstractClass abstractClassB = new ConcreateClassB();

        abstractClassA.templateMethod();
        abstractClassB.templateMethod();

    }

}
