package com.ikaimen.gson;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.ikaimen.fastjson.Class;
import sun.security.provider.MD5;

import java.security.MessageDigest;

/**
 * @ClassName TestGson
 * @Description TODO
 * @Author chentao
 * @Date 2019/9/23 12:08 下午
 * @ModifyDate 2019/9/23 12:08 下午
 * @Version 1.0
 */
public class TestGson {


    public static void main(String[] args) {

        Class c = new Class();
        c.setName("abc");
        c.setNum(102);
       // c.setGrade(6);
        System.out.println(getMD5(new Gson().toJson(c)));
        System.out.println(getMD5(JSON.toJSONString(c)));
    }

    public static String getMD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            byte[] btInput = s.getBytes("utf-8");
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
