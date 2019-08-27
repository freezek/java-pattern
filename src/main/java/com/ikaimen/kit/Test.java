package com.ikaimen.kit;

import com.ikaimen.fastjson.Class;
import com.ikaimen.fastjson.User;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.runtime.RuntimeSchema;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @ClassName Test
 * @Description TODO
 * @Author chentao
 * @Date 2019/8/21 10:22 AM
 * @ModifyDate 2019/8/21 10:22 AM
 * @Version 1.0
 */
public class Test {


    public static void main(String[] args) {

        User user = new User();

        user.setSex("男");
        user.setName("张三");
        user.setAge(18);
        user.setaClass(new Class());

//        int [][] a=new int[][]{{1,2,3},{2,3}};
//
//        char[] chars = "1010101".toCharArray();
//
//        System.out.println(chars.toString());
//        int[] ints = new int[chars.length];
//        for (int i = 0; i < chars.length; i++) {
//            ints[i] = chars[i]-48;
//        }
//        System.out.println(ints);
//        byte[] bytess = "hello".getBytes();
//        System.out.println(bytess);
//
//        System.out.println(user);
//
//        long start =  System.currentTimeMillis();
//        for (int i = 0; i < 10; i++) {
//            ProtoStuffUtil.serialize(user);
//
//          byte[] bytes =  ProtostuffIOUtil.toByteArray(user, RuntimeSchema.getSchema(User.class),LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
//
//          System.out.println(bytes.toString());
//        }
//
//        System.out.println("序列化耗时：" + (System.currentTimeMillis()-start));
//
//        byte[] bytes = ProtoStuffUtil.serialize(user);
//
//        long start1 = System.currentTimeMillis();
//
//        for (int i = 0; i < 10; i++) {
//
//          User user1 =  ProtoStuffUtil.unserialize(bytes,User.class);
//            System.out.println(user1);
//
//        }


//        System.out.println("反序列化耗时："+(System.currentTimeMillis() - start1));
//
//        System.out.println("hello".getBytes());

        byte[] bytes = ProtoStuffUtil.serialize(user);


        System.out.println('k'^'p');
        System.out.println(Character.hashCode('k'));
        System.out.println(Character.hashCode('p'));
        System.out.println(Integer.toBinaryString(107));
        System.out.println(Integer.toBinaryString(112));

        System.out.println(Integer.toBinaryString(107));
        System.out.println(Integer.toBinaryString(112));


    }


}
