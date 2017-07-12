package com.ikaimen.pattern.TemplateMethodPattern;

/**
 * Created by ChenTao on 2017/7/9.
 * 具体模板类
 */
public class ConcreateClassA extends AbstractClass {
    @Override
    protected void doSomeThing() {
        System.out.println("我是模型A，正在做只有我可以做的事情！");
    }

    @Override
    protected void doAnyThing() {
        System.out.println("我是模型的共有功能！");

    }
}
