package com.ikaimen.web.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName PrototypeService
 * @Description
 * @Author Mr.Chen
 * @Date 2021/4/1 下午7:04
 * @Version V1.0
 **/
@Component
@Scope("prototype")
public class PrototypeService2 {

    public PrototypeService2(){
        System.out.println(this.getClass());
    }

    public void say(){
        System.out.println("hello");
    }
}
