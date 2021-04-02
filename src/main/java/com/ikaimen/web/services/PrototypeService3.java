package com.ikaimen.web.services;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName PrototypeService
 * @Description
 * @Author Mr.Chen
 * @Date 2021/4/1 下午7:04
 * @Version V1.0
 **/
@Component
@Scope("prototype")
public class PrototypeService3 {

    private String name;

    @PostConstruct
    private void setName(){
        this.name = this.toString();
    }

    public String getName(){
        return this.name;
    }

    public PrototypeService3(){
        System.out.println(this.getClass());
    }


    public void say(){
        System.out.println("hello");
    }


}
