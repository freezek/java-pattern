package com.ikaimen.algo;

import com.ikaimen.fastjson.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Test
 * @Description TODO
 * @Author chentao
 * @Date 2019/9/9 4:33 下午
 * @ModifyDate 2019/9/9 4:33 下午
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("ab");
        list.add("bc");
        list.add("ae");
        list.add("dc");
        list.add("ef");
        list.add("cd");
        list.add("hu");

        List<String> bc = list.parallelStream().filter(s -> s.equals("bc")).map(s -> s.toUpperCase()).collect(Collectors.toList());

        User user = new User();

        user.setName("zhangsan");

        HashMap<String, User> user1 = new HashMap<>();

        user1.put("zhang",user);

        HashMap<String, User> user2 = new HashMap<>();

        user2.put("li",user1.get("zhang"));

        System.out.println(user1.get("zhang"));

        user.setName("lisi");

        System.out.println(user2.get("li"));

        System.out.println(user1.get("zhang"));

        System.out.println(bc);

    }

}
