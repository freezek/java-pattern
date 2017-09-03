package com.ikaimen.pattern.AdapterPattern;

/**
 * @Author: Mr.Chen
 *
 * @Description: 场景类
 *
 * @Date: Created in 2017-09-03 下午3:07
 **/
public class Client {

    public static void main(String[] args) {


        //原有的业务逻辑

        Target target = new ConcreteTarget();

        target.request();

        //现在加了适配器的角色之后的业务逻辑

        Target target1 = new Adapter();

        target1.request();

    }

}
