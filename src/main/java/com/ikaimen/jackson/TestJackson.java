package com.ikaimen.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ikaimen.fastjson.Class;
import com.ikaimen.fastjson.User;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

/**
 * @ClassName TestJackson
 * @Description TODO
 * @Author Mr.chen
 * @Date 2020/1/10 12:01 下午
 * @ModifyDate 2020/1/10 12:01 下午
 * @Version 1.0
 */
@Slf4j
public class TestJackson {

    public static void main(String[] args) throws Exception{

        log.info(test());
    }

    public static String test(){
        Class aClass = new Class();
        //aClass.setGrade(1);
        aClass.setName("小学一班");
        aClass.setNum(10);
        User user = new User();
        user.setSex("1");
        user.setAge(18);
        user.setName("Tom");
        user.setaClass(aClass);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        try {
            ///objectMapper.writeValue(new File("./jackson"),user);
            User user1 = objectMapper.readValue(new File("./jackson"), User.class);
            System.out.println(user1.toString());

            String str = null;
            String s = Optional.ofNullable(str).orElse("===");

            return s;

        } catch (IOException e) {
            return aClass.toString();
        } finally {
            System.out.println("9999");
        }
    }

}