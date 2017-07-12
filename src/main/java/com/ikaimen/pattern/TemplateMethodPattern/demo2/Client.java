package com.ikaimen.pattern.TemplateMethodPattern.demo2;

/**
 * Created by ChenTao on 2017/7/9.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {

        HummerAModel  modelA = new HummerAModel();

        HummerBModel modelB = new HummerBModel();


        modelA.setAlarm(true);
        modelA.run();
        System.out.println("_________");
        modelA.setAlarm(false);
        modelA.run();
        System.out.println("_________");
        modelB.run();

    }

}
