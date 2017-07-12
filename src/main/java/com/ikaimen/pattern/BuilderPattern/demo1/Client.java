package com.ikaimen.pattern.BuilderPattern.demo1;

import java.util.ArrayList;

/**
 * Created by ChenTao on 2017/7/12.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {

       Director director  = new Director();

        for(int i = 0;i<100;i++){
            BenzModel benz = director.getBenzModel();
            benz.run();
        }

    }
}
