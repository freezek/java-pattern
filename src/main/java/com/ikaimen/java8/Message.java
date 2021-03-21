package com.ikaimen.java8;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Message
 * @Description TODO
 * @Author Mr.chen
 * @Date 2019/12/2 2:25 下午
 * @ModifyDate 2019/12/2 2:25 下午
 * @Version 1.0
 */
@Data
public class Message {
    private String accountId;
    private String userId;
    private String courseId;
    private String chapterId;
    private String lessonId;
    private String sortId;

    public static void main(String[] args) {

        ArrayList<Object> objects = Lists.newArrayList();

        objects.add("1");

        Message message = new Message();
        message.setUserId("CT");
        Message add = message.add(objects, message);

        System.out.println(objects.size()+"---"+add.getAccountId());


    }

    private Message add(List list,Message message){
        message.setAccountId("16888");

        Message message1 = new Message();
        message1.setAccountId("16777");
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        message = message1;

        return message;
    }

}