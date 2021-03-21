package com.ikaimen.javase.collection;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @ClassName TestTreeMap
 * @Description
 * @Author Mr.Chen
 * @Date 2021/2/1 下午1:54
 * @Version V1.0
 **/
public class TestTreeMap {

    @Test
    public void test(){

        TreeMap< RouterTreeNode,String > sortedTree = Maps.newTreeMap();

        sortedTree.put(new RouterTreeNode("1","TEST","1","1",5,null),"TEST");
        sortedTree.put(new RouterTreeNode("2","TEST","2","1",2,"1"),"STUDY");
//        sortedTree.put(new RouterTreeNode("3","TEST","3","1",3,"1"),"RESTUDY");
        sortedTree.put(new RouterTreeNode("4","TEST","3","1",6,"1"),"REVIEW");
        sortedTree.put(new RouterTreeNode("5","TEST","3","1",1,"1"),"CHECK_TEST");

        System.out.println(sortedTree.size());

        // 迭代TreeMap的结果
        Iterator<Map.Entry< RouterTreeNode,String >> iterator = sortedTree.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry< RouterTreeNode,String > entry = iterator.next();
            System.out.println("key : "+entry.getKey().getSequence()+" value : " + entry.getValue()+" status :"+entry.getKey().getStatus());
            if("REVIEW".equals(entry.getValue())){
                break;
            }
        }
        System.out.println("-----");
        sortedTree.put(new RouterTreeNode("4","TEST","3","0",3,"1"),"AAA");
        // 迭代TreeMap的结果
        Iterator<Map.Entry< RouterTreeNode,String >> iterator1 = sortedTree.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry< RouterTreeNode,String > entry = iterator1.next();
            System.out.println("key : "+entry.getKey().getSequence()+" value : " + entry.getValue()+" status :"+entry.getKey().getStatus());
        }

        System.out.println(JSON.toJSON(sortedTree.higherEntry(new RouterTreeNode("4","TEST","3","0",3,"1"))));

    }

}
