package com.ikaimen.fastjson;


import org.springframework.beans.BeanUtils;
import sun.tools.java.Environment;

/**
 * @ClassName TestBeanUtil
 * @Description TODO
 * @Author chentao
 * @Date 2019/6/28 11:54 PM
 * @ModifyDate 2019/6/28 11:54 PM
 * @Version 1.0
 */
public class TestBeanUtil {

    public static void main(String[] args) {

        User user = new User();

        User user1 = new User();

        Class clazz = new Class();

        //clazz.setGrade(7);
        clazz.setName("尖子班");
        clazz.setNum(002);


        try {
            user.setName("张三");
            user.setAge(18);
            user.setaClass(clazz);
            BeanUtils.copyProperties(user, user1);

            System.out.println(user == user1);
            System.setProperty("hello","cute");
            System.out.println(System.getProperty("hello"));

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(user);
        }

    }
}
