package com.ikaimen.javase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName TestHasMap
 * @Description TODO
 * @Author chentao
 * @Date 2019/7/16 11:39 AM
 * @ModifyDate 2019/7/16 11:39 AM
 * @Version 1.0
 */
public class TestHasMap {

    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(1,1);
        map.put(2,1);

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getValue());
        }

    }

}
