package com.ikaimen.kit;

import java.util.ArrayList;

public class TestDebug {

    public static void main(String[] args) {


        ArrayList<Bear> bears = new ArrayList<>();
        ArrayList<Bear> bears1 = new ArrayList<>();

        Bear tom = new Bear("11", 2);
        Bear jack = new Bear("jack", 1);

        bears.add(tom);
        bears.add(jack);

        bears1.add(tom);
        bears1.add(jack);

        bears1.addAll(bears);
        bears.clear();
        char c = tom.getName().charAt(0);
        System.out.println(Integer.valueOf(c));
        System.out.println(bears.size());

    }

}
