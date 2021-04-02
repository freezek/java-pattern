package com.ikaimen.web.controller;

import com.ikaimen.web.services.PrototypeService;
import com.ikaimen.web.services.PrototypeService3;
import com.ikaimen.web.services.SingletonService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ScopeControllerS
 * @Description
 * @Author Mr.Chen
 * @Date 2021/4/1 下午7:17
 * @Version V1.0
 **/
@RestController
@RequestMapping("/test2")
public class ScopeControllerZ implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @GetMapping("/scope")
    public void scope(){
        PrototypeService3 bean = applicationContext.getBean(PrototypeService3.class);
        System.out.println(bean);
        System.out.println("this instance name is :" +bean.getName());
        System.out.println(applicationContext.getBean(SingletonService.class));
    }
}
