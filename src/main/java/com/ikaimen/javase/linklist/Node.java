package com.ikaimen.javase.linklist;

import lombok.Data;

/**
 * @ClassName Node
 * @Description
 * @Author Mr.Chen
 * @Date 2021/3/2 下午5:27
 * @Version V1.0
 **/
@Data
public class Node {
    private Node next;
    private int value;
}
