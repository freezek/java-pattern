package com.ikaimen.algo;

import java.util.*;

/**
 * @ClassName TestFindCheapestSeats
 * @Description TODO
 * @Author Mr.chen
 * @Date 2020/3/1 11:44 上午
 * @ModifyDate 2020/3/1 11:44 上午
 * @Version 1.0
 */
public class TestFindCheapestSeats {
    /**
     * 价格作为列表
     * 1. x张连座票
     * 2. 总价最便宜
     * 3. 返回这x张票第一个pos
     */
    private static List<Integer> seats = Arrays.asList(10, 1, 1, 2, 4, 5, 2, 1, 3);

    public static void main(String[] args) {
        System.out.println("seat position: " + findCheapestSeatPosition2(seats, 5));

    }

    public static int findCheapestSeatPosition2(List<Integer> seats, int x) {
        int pos = 0;
        int left = 0;
        int right = x;
        HashMap<Integer, Integer> cost = new HashMap<>();

        /**
         * solution: 滑动窗口思路
         *  1,循环遍历算出所有连坐票价
         *  2,把所有循环票价及第一个索引存入hashMap
         *  3,排序map 获得最小的index
         */
        while (right <= seats.size()) {
            int tmpCost = 0;
            for (int i = left; i < right; i++) {
                tmpCost += seats.get(i);
            }
            cost.put(left, tmpCost);
            right++;
            left++;
        }
        //求对map 的value进行排序
        List<Map.Entry<Integer, Integer>> list = new ArrayList(cost.entrySet());
        Collections.sort(list, (c1, c2) -> (c1.getValue() - c2.getValue()));
        pos = list.get(0).getKey();

        return pos;
    }
}