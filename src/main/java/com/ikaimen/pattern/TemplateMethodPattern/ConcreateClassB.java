package com.ikaimen.pattern.TemplateMethodPattern;

/**
 * Created by ChenTao on 2017/7/9.
 * 具体模板类B
 */
public class ConcreateClassB extends AbstractClass {
    @Override
    protected void doSomeThing() {
        System.out.println("我是模型B，我正在做只有我能做的事情！");

    }

    @Override
    protected void doAnyThing() {
        System.out.println("我是模型的共有功能！");

    }
}
