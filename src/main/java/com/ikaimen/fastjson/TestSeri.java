package com.ikaimen.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;
import java.util.HashMap;

public class TestSeri {

    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();


        User user = new User();
        user.setaClass(null);
        user.setAge(18);
        user.setName("tom");
        user.setSex("1");
        User user2 = new User();
        user.setaClass(null);
        user.setAge(18);
        user.setName("tom");
        user.setSex("1");

        objects.add(user);
        objects.add(user);

        objectObjectHashMap.put("abc",user);
        objectObjectHashMap.put("bcd",user2);

//        Abc abc = new Abc();
//        abc.setAbc(abc);
//        objects.add(abc);
//        objects.add(abc);
//        objects.add(abc);

        System.out.println(JSON.toJSONString(objectObjectHashMap,SerializerFeature.DisableCircularReferenceDetect));
        System.out.println(JSON.toJSONString(objectObjectHashMap));
        System.out.println(objectObjectHashMap  instanceof  Object);

    }

   static class Abc{
       //@JSONField(serialzeFeatures = SerializerFeature.DisableCircularReferenceDetect)
        private Abc abc;

        public Abc getAbc() {
            return abc;
        }

        public void setAbc(Abc abc) {
            this.abc = abc;
        }
    }
}
