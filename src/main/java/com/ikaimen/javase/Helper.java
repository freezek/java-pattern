package com.ikaimen.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Helper
 * @Description TODO
 * @Author chentao
 * @Date 2019/8/2 2:15 PM
 * @ModifyDate 2019/8/2 2:15 PM
 * @Version 1.0
 */
public class Helper {


    public static List<Integer> caculate(List<Integer> list){

        List list1 = new ArrayList();

        for (Integer t:list){

            t++;

            list1.add(t);
        }

        return list1;
    }

}
