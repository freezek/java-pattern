package com.ikaimen.kit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDebug {

    public static void main(String[] args) {


        ArrayList<Bear> bears = new ArrayList<>();
        ArrayList<Bear> bears1 = new ArrayList<>();

        Bear tom = new Bear("11", 2);
        Bear jack = new Bear("jack", 1);

        bears.add(tom);
        bears.add(jack);

        Map<Integer, Integer> collect = bears.stream().map(bear -> bear.getName()).collect(Collectors.toList()).stream().collect(Collectors.toMap(String::length, String::length));

        bears1.add(tom);
        bears1.add(jack);

        bears1.addAll(bears);
        bears.clear();
        char c = tom.getName().charAt(0);
        System.out.println(Integer.valueOf(c));
        System.out.println(bears.size());

    }

//    @BeforeEach
//    public void test1(){
//        System.out.println(111);
//    }
//
//    @AfterEach
//    public void runAfterTestMethod() {
//        System.out.println("@After - runAfterTestMethod");
//    }
//
//    @Test
//    public void test(){
//       // Assert.assertEquals(1,2);7
//    }

}
