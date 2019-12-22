package com.ikaimen.java8;

import com.alibaba.fastjson.JSON;
import com.ikaimen.fastjson.Class;
import com.ikaimen.fastjson.User;
import org.springframework.util.Assert;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Mr.Chen
 * @title:
 * @projectName com.ikaimen
 * @description: TODO
 * @date 2019/4/9  7:44 PM
 **/
public class StreamDemo {


    public static void testStream(){

//        String[] strs = new String[]{"a","b","c","d","e","f","g","h","i","j","k"};
//        List list = new ArrayList();
//        Arrays.asList(strs).stream().filter(e->!"j".equals(e)).forEach(p-> {
//            list.add(p);
//            System.out.println(JSON.toJSONString(list));
//        });
//
//        String[] str = new String[]{"h e l l o","s t r e a m"};
//
//        List list1 = Arrays.asList(str).stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
//
//        System.out.println(JSON.toJSONString(strs));

        User user = new User();

        user.setName("john");
        user.setAge(12);
        user.setaClass(new Class());
        user.setSex("women");
        HashMap hashMap = JSON.parseObject(JSON.toJSONString(user), HashMap.class);
        System.out.println(hashMap.get("name"));

    }



    public static void main(String[] args) {


        System.out.println(String.format("hello:%s","bn"));

//       String str = "13:41:41.306516 127.0.0.1 00427 {\"@version\":1,\"@timestamp\":\"2019-12-04T13:41:41+08:00\",\"message\":{\"serial_num\":\"bf71c5b1165811ea80e100163e1c67fd\",\"appId\":\"123456789\",\"token\":\"123456789\",\"teacher_id\":3129639497715806,\"old_teacher_id\":3129639497715806,\"subject_id\":\"2\",\"user_id\":6869639497716190,\"course_id\":10000178,\"chapter_id\":10000196,\"lesson_ids\":\"10000197,10000198\",\"time\":1575438101,\"event\":\"UNLOCK_COURSE_NORMALIZED\",\"event_source\":\"teacher_center_v2\"}}";
//        String[] split = str.split(" ");
//        System.out.println(split.length);
        //
        // testStream();

//        System.out.println(6/2);
//
//        A a = new A("a","18");
//
//        A b = new A("b","19");
//
//        swap(a,b);
//
//        System.out.println(a.getName()+"---"+b.getName());

    }

    public static void swap(A a,A b){

        A temp;
        temp = a;
        a = b;
        b = temp;

    }

    static class A{

        private String name ;

        private String age ;

        public A(String name,String age){

            this.age = age;
            this.name = name;

        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
