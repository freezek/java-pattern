package com.ikaimen.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description 求两数之和
 * @Author chentao
 * @Date 2019/7/12 2:50 PM
 * @ModifyDate 2019/7/12 2:50 PM
 * @Version 1.0
 */
public class Solution {

    private Logger logger = LoggerFactory.getLogger(Solution.class);

    public int[] twoSum(int[] nums, int target) {

        int length = nums.length;

        for (int i = 0; i < length; i++) {

            for (int j = i+1; j < length; j++) {
                //logger.info("i={},j={}", i, j);

                System.out.println(i+"====="+j);
                if (target == nums[i] + nums[j]) {

                    return new int[]{i,j};
                }

            }
        }

         throw new IllegalArgumentException(" not find !");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {5, 1, 2, 18};
        int target = 20;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(solution.twoSum(array, target)));

    }
}
