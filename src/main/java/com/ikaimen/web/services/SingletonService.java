package com.ikaimen.web.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName SingletonService
 * @Description
 * @Author Mr.Chen
 * @Date 2021/4/1 下午7:06
 * @Version V1.0
 **/
@Component
@Scope("singleton")
public class SingletonService {

    public SingletonService(){
        System.out.println(this.getClass());
    }

    public void say(){
        System.out.println("hello");
    }
}
