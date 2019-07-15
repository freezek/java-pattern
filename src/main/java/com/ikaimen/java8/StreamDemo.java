package com.ikaimen.java8;

import java.util.Arrays;
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

        String[] strs = new String[]{"a","b","c","d","e","f","g","h","i","j","k"};

        Arrays.asList(strs).stream().filter(e->"j".equals(e)).forEach(p-> System.out.println(p));

        String[] str = new String[]{"h e l l o","s t r e a m"};

        List list = Arrays.asList(str).stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

        System.out.println(list.toString());

    }



    public static void main(String[] args) {

        //
        // testStream();

        System.out.println(6/2);

        A a = new A("a","18");

        A b = new A("b","19");

        swap(a,b);

        System.out.println(a.getName()+"---"+b.getName());

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
