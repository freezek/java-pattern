package com.ikaimen.pattern.AdapterPattern;

/**
 * @Author: Mr.Chen
 *
 * @Description: 目标角色的实现类
 *
 * @Date: Created in 2017-09-03 下午3:01
 **/
public class ConcreteTarget implements Target{
    @Override
    public void request() {

        System.out.println("If you need any help, pls call  me !");

    }
}
