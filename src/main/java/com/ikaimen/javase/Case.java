package com.ikaimen.javase;

import java.util.List;

/**
 * @ClassName Case
 * @Description TODO
 * @Author chentao
 * @Date 2019/8/2 2:59 PM
 * @ModifyDate 2019/8/2 2:59 PM
 * @Version 1.0
 */
public class Case<T> {

    public  void printvalue(List<T> list){
        List<Integer> list1 = Helper.caculate((List<Integer>) list);

        System.out.println(list1.get(list.size()-1));
    }

}
