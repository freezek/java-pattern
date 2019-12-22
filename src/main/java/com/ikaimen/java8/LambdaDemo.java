package com.ikaimen.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Auther: ASUS
 * @Date: 2018/12/23 18:46
 * @Description:
 */
public class LambdaDemo {


    public static void main(String[] args) {

        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        // 以前的循环方式
        for(
                String player :players)
        {
            System.out.println(player + "; ");
        }

        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player)-> System.out.print(player +"; "));

        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);

        Arrays.sort(atp,(String s1,String s2)->(s1.length()-s2.length()));

        List<String> palyers2 = Arrays.asList(atp);

        palyers2.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s+"+++++");
            }
        });
        palyers2.forEach((String p2)-> System.out.print(p2+"-----"));

      /*  Comparator<String> sortByLastLetter =
                (String s1, String s2) ->
                        (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
        Arrays.sort(atp, sortByLastLetter);*/

        System.out.println();
      Arrays.sort(atp,(String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)));

       List players3 = Arrays.asList(atp);

       players3.forEach((p3)-> System.out.print(p3+"-$$$$$"));
    }

}
