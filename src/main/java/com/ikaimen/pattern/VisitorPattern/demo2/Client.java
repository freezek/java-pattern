package com.ikaimen.pattern.VisitorPattern.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Chen
 *
 * @Description: 场景类
 *
 * @Date: Created in 2017/9/24 下午6:34
 **/
public class Client {

    public static void main(String[] args) {

        for (Employee e:mockEmployee()){

            e.accept(new Visitor());
        }


    }


    public static List<Employee> mockEmployee(){


        List<Employee> list = new ArrayList<Employee>();

        // 生产张三

        CommonEmployee zhangSan =  new CommonEmployee();

        zhangSan.setName("张三");

        zhangSan.setSex(1);

        zhangSan.setJob("Java程序员！");

        zhangSan.setSalary(1800);


        //生产李四

        CommonEmployee liSi = new CommonEmployee();

        liSi.setName("李四");

        liSi.setSex(0);

        liSi.setJob("前端开发工程师！");

        liSi.setSalary(1800);

        //生产一个经理

        Manager wangWu = new Manager();

        wangWu.setName("王五");

        wangWu.setSex(1);

        wangWu.setPerformance("业绩优秀！");

        wangWu.setSalary(18000);

        list.add(zhangSan);
        list.add(liSi);
        list.add(wangWu);

        return list;

    }
}
