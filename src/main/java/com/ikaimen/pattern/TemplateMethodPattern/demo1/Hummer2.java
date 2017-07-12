package com.ikaimen.pattern.TemplateMethodPattern.demo1;

/**
 * Created by ChenTao on 2017/7/9.
 * 悍马型号1
 */
public  class Hummer2 extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马型号二启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马型号二停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马型号二鸣号");

    }

    @Override
    public void engineBoom() {
        System.out.println("悍马型号二引擎轰鸣");

    }
}
