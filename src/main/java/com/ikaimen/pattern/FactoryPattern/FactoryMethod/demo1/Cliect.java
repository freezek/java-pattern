package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 测试工厂方法模式
 */
public class Cliect {


    public static void main(String[] args) {

        //声明制造工厂
        AbstractHumanFactory factory = new HumanFactory();

        Human whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human yellowHuman  = factory .createHuman(YellowHuman.class);

        yellowHuman.getColor();
        yellowHuman.talk();

        Human blackHuman = factory.createHuman(BlackHuman.class);

        blackHuman.getColor();
        blackHuman.talk();

    }


}
