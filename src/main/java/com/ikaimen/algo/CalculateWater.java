package com.ikaimen.algo;

import java.util.Stack;

/**
 * @ClassName CalculateWater
 * @Description TODO
 * @Author chentao
 * @Date 2019/9/8 6:20 下午
 * @ModifyDate 2019/9/8 6:20 下午
 * @Version 1.0
 */
public class CalculateWater {


    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(solution(array));
    }

    private static int solution(int[] array) {

        Stack<Integer> stack = new Stack();

        int water = 0;
        if (array.length == 0) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {

            if(stack.size()==0){
                stack.push(array[i]);
            }

            if (i > 0 && i < array.length -1) {

                if (stack.peek() < array[i ]) {

                    int temp = Math.abs(stack.pop() - array[i ]);
                    if(i>1){
                        water += temp;
                    }
                    stack.push(array[i]);
                    System.out.println(stack.size()+":"+stack.peek());
                } else {
                    System.out.println(stack.size()+":"+stack.peek());
                    int temp = Math.abs(stack.peek() - array[i]);
                   if(i>1){
                       water += temp;
                   }
                }

            }

        }

        return water;
    }

}
