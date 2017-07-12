package com.ikaimen.pattern.BuilderPattern.demo1;

/**
 * Created by ChenTao on 2017/7/12.
 * 奔驰模型代码
 */
public class BenzModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("奔驰开始启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停车");

    }

    @Override
    protected void alarm() {
        System.out.println("奔驰鸣号");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰引擎响动");

    }
}
