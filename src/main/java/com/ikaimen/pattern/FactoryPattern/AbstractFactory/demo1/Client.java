package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 造人测试
 */
public class Client {

    public static void main(String[] args) {


        //第一条生产线，男性生产线

        HumanFactory humanFactory = new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory humanFactory2 = new FemaleFactory();

        Human whiteMale  =  humanFactory.createWhiteHuman();

        whiteMale.getSex();
        whiteMale.getColor();
        whiteMale.talk();


        Human whiteFemale =humanFactory2.createWhiteHuman();

        whiteFemale.getSex();
        whiteFemale.getColor();
        whiteFemale.talk();


    }


}
