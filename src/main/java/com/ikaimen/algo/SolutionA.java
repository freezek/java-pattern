package com.ikaimen.algo;

/**
 * @ClassName SolutionA
 * @Description 移除有序数组重复元素
 * @Author chentao
 * @Date 2019/7/12 3:52 PM
 * @ModifyDate 2019/7/12 3:52 PM
 * @Version 1.0
 */
public class SolutionA {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                System.out.println(i+"----"+j);
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }


    public static void main(String[] args) {

        int[] a = new int[]{2,2,2,4};


       // a[1] = a[2];

        System.out.println(new SolutionA().removeDuplicates(a));

    }

}
