package com.ikaimen.pattern.TemplateMethodPattern.demo1;

/**
 * Created by ChenTao on 2017/7/9.
 * 悍马型号2
 */
public  class Hummer1 extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马型号一启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马型号一停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马型号一鸣号");

    }

    @Override
    public void engineBoom() {
        System.out.println("悍马型号一引擎轰鸣");

    }
}
