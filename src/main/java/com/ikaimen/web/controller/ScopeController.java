package com.ikaimen.web.controller;

import com.ikaimen.web.services.PrototypeService;
import com.ikaimen.web.services.PrototypeService2;
import com.ikaimen.web.services.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ScopeController
 * @Description
 * @Author Mr.Chen
 * @Date 2021/4/1 下午7:02
 * @Version V1.0
 **/
@RestController
@RequestMapping("/test")
public class ScopeController {

    @Autowired
    private PrototypeService prototypeService;

    @Autowired
    private SingletonService singletonService;

    @GetMapping("/scope")
    public void scope(){

        for (int i = 0; i < 5; i++) {

            System.out.println(prototypeService);

        }

        for (int i = 0; i < 5; i++) {

            System.out.println(singletonService);

        }

    }

    @GetMapping("/scope2")
    public void scopeByPram(@Autowired PrototypeService2 prototypeService2){

        for (int i = 0; i < 5; i++) {

            System.out.println(prototypeService2);

        }


    }
}
