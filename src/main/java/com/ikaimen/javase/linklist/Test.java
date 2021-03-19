package com.ikaimen.javase.linklist;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @ClassName Test
 * @Description
 * @Author Mr.Chen
 * @Date 2021/3/2 下午5:28
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        Node node = new Node();
        Node node1 = new Node();
        node1.setNext(null);
        node1.setValue(10);
        node.setNext(node1);
        node.setValue(9);

        System.out.println(JSON.toJSONString(node, SerializerFeature.DisableCircularReferenceDetect));

        Node node2 = JSONObject.parseObject(JSON.toJSONString(node, SerializerFeature.DisableCircularReferenceDetect), Node.class);
        node2.setValue(11);
        System.out.println(node2.getNext()+"----"+node2.getValue());
        node1.setValue(13);
        System.out.println(JSON.toJSONString(node, SerializerFeature.DisableCircularReferenceDetect));

    }
}
