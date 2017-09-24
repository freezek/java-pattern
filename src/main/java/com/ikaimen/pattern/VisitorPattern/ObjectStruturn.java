package com.ikaimen.pattern.VisitorPattern;

import java.util.Random;

/**
 * @Author: Mr.Chen
 *
 * @Description: 结构对象
 *
 * @Date: Created in 2017/9/24 下午6:53
 **/
public class ObjectStruturn {


    public  static  Elment createElement(){

        Random random = new Random();

        if (random.nextInt(100)>50){

            return  new ConcreteElement1();

        }else {

            return  new ConcreteElement2();
        }
    }

}
