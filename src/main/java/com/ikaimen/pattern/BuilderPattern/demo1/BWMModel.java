package com.ikaimen.pattern.BuilderPattern.demo1;

/**
 * Created by ChenTao on 2017/7/12.
 * 宝马模型代码
 */
public class BWMModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("宝马开始启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停车");

    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣号");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎响动");

    }
}
