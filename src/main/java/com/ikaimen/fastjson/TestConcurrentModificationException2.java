package com.ikaimen.fastjson;

import java.util.*;

/**
 * @ClassName TestConcurrentModificationException
 * @Description TODO
 * @Author chentao
 * @Date 2019/6/28 5:27 PM
 * @ModifyDate 2019/6/28 5:27 PM
 * @Version 1.0
 */
public class TestConcurrentModificationException2 {


    public static void main(String[] args) {


        List<User> users = new ArrayList<>();

        User user = new User();

        user.setName("zhan");
        user.setAge(18);

        User user1 = new User();

        user1.setName("lisi");
        user1.setAge(15);

        users.add(user1);
        users.add(user);

//        Iterator iterator = users.iterator();
//
//        while (iterator.hasNext()) {
//
//          //  iterator.remove();
//            System.out.println(iterator.next());
//
//        }

//        for (User user2 : users){
//
//            users.remove(user2);
//
//        }

        System.out.println(users.size());

        Set<Integer> chain = new TreeSet<Integer>();
        chain.add(1);
        chain.add(2);

//        Iterator<Integer> iterator = chain.iterator();
//        if (iterator.hasNext())
//        {
//            chain.remove(iterator.next());
//        }

//        for( Integer integer : chain){
//
//            chain.remove(integer);
//        }

        for(int i=0;i<chain.size();i++){
            chain.remove(1);
        }
        System.out.println(chain.size());

    }

}
