package com.ikaimen.pattern.TemplateMethodPattern.demo1;

/**
 * Created by ChenTao on 2017/7/9.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {


        HummerModel model = new Hummer1();
        HummerModel model1 = new Hummer2();

        model.run();

        model1.run();



    }
}
