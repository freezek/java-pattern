package com.ikaimen.pattern.VisitorPattern;

/**
 * @Author: Mr.Chen
 *
 * @Description: 场景类
 *
 * @Date: Created in 2017/9/24 下午6:55
 **/
public class Client {

    public static void main(String[] args) {

        for (int i =0 ;i<10;i++){

            Elment elment = ObjectStruturn.createElement();

            elment.accept(new Visitor());
        }
    }

}
