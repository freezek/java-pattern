package com.ikaimen.javase;

/**
 * @ClassName TestFinally
 * @Description TODO
 * @Author chentao
 * @Date 2019/7/14 3:23 PM
 * @ModifyDate 2019/7/14 3:23 PM
 * @Version 1.0
 */
public class TestFinally {


    public static String say(String str) {

        try {

            if ("".equals(str) || str == null) {

                throw new IllegalArgumentException("输入参数不能为空！");

            }

            return str;

        } catch (IllegalArgumentException e) {

            str = "异常处理";

            return str;

        } finally {

            return "finally 处理";

        }
    }

    public static void main(String[] args) {

        System.out.println( say(""));
        String a = "";
        System.out.println("".equals(a));

    }

}
