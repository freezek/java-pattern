package com.ikaimen.javase;

import java.util.*;

/**
 * @ClassName TestHashCodeAndEquals
 * @Description TODO
 * @Author chentao
 * @Date 2019/7/21 9:00 AM
 * @ModifyDate 2019/7/21 9:00 AM
 * @Version 1.0
 */
public class TestHashCodeAndEquals {

    public static void main(String[] args) {

        Map map = new HashMap<>();
        Set set = new HashSet<>();
        A a1 = new A("lisi",18);

        A a2 = new A("lisi",18);

        map.put(a1,a1.toString());
        map.put(a2,a2.toString());
        System.out.println(map.get(a1));
        System.out.println(map.get(a2));
        set.add(a1);
        set.add(a2);
        Iterator iterator = map.entrySet().iterator();


    }

   static class A{

        String name;
        int  age ;

        public A(String name,int age){

            this.name = name;
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

       @Override
       public boolean equals(Object obj) {

            A a = (A) obj;
            if(a.age==this.age&&a.name==this.name){
                return true;
            }

           return false;
       }
   }
}
