package com.ikaimen.javase.collection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class TestIterator {

    @Test
    public void test(){

        List list = new ArrayList<>();
        for (int i=0;i<=10000;i++) {
            list.add(1);
            list.add(2);
            list.add('a');
            list.add("b");
        }

        Iterator iterator = list.iterator();

        long l = System.currentTimeMillis();
        while (iterator.hasNext()){
         // log.info("当前遍历的Value："+iterator.next().toString());
           iterator.next();
        }
        log.info("iterator spend time :{}",System.currentTimeMillis()-l);
        long ll = System.currentTimeMillis();
        for (Object o: list) {
            // log.info("当前遍历的Value："+o.toString());
        }
        log.info("foreach spend time :{}",System.currentTimeMillis()-ll);

        long lll = System.currentTimeMillis();
        for (int i=0;i<list.size();i++) {
            // log.info("当前遍历的Value："+o.toString());

        }
        log.info("foreach spend time :{}",System.currentTimeMillis()-lll);
    }

}
