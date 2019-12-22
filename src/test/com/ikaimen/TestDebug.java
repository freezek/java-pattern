package com.ikaimen;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @ClassName TestDebug
 * @Description TODO
 * @Author chentao
 * @Date 2019/11/8 11:48 上午
 * @ModifyDate 2019/11/8 11:48 上午
 * @Version 1.0
 */
public class TestDebug {

    public static void test(String str){

        char[] chars = str.toCharArray();
        Stack<Character> objects = new Stack<>();;
        for (char c : chars) {

            objects.push(c);
        }

        while (!objects.empty()){
            System.out.println(objects.pop());
        }
    }

    public static void main(String[] args) {

        LinkNode linkNode = new LinkNode(2);
        LinkNode linkNode1 = new LinkNode(3);
        linkNode.next = linkNode1;

        test4(linkNode);



    }

    public static boolean test2(String str){

        char[] chars = str.toCharArray();

        if(chars.length == 0) return false;
        int left = 0;
        int right = chars.length-1;
        boolean isHuiwen = false;
        for ( int i=0;i<chars.length;i++){

            if(chars[left]!=chars[right-i]){
                return  isHuiwen;
            }else {
                isHuiwen = true;
            }
        }

        return isHuiwen;

    }

    public static LinkNode test3(LinkNode la,LinkNode lb){

        if(la.next==null) return lb;
        if (lb.next == null) return la;
        LinkNode linkNode = new LinkNode(1);
        if(la.value < lb.value){
            linkNode.next = lb;
        }
        if(la.value> lb.value){
            linkNode.next = la;
        }
        return null;

    }

    public static void test4(LinkNode linkNode){

        LinkNode currentNode = linkNode;
        System.out.println(currentNode.value);

        if(currentNode.next != null){

            currentNode = currentNode.next;
            test4(currentNode);
        }
    }



    static class LinkNode{
        int value;
        LinkNode next;

        public LinkNode(int value){
            this.value = value;
        }
    }


}
