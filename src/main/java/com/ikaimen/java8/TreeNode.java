package com.ikaimen.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName TreeNode
 * @Description TODO
 * @Author Mr.chen
 * @Date 2019/12/19 7:19 下午
 * @ModifyDate 2019/12/19 7:19 下午
 * @Version 1.0
 * 有一个有上万项的非空集合List<Node> nodeCollection，请对一下方法做补充（你认为最佳、最快的方式），返回一颗树对象TreeNode，把所有项按照父子关系串起来，注：根节点唯一，且parentId为空，并假设除根节点以外的节点都有父节点
 */
public class TreeNode {
	Long id;
	Long parentId;
	String name;
	List<TreeNode > children;


    public TreeNode generateTree(List<Node> nodeCollection) {
        TreeNode  root = new TreeNode();
        /**
         * 遍历集合 如果节点有父节点则加入父节点，没有父节点则创建父节点，并保存父节点；创建hashmap 存储所有已经遍历的父节点
         * 最终把所有节点存入根节点
         */
        Long tempId = 0L;
        HashMap<Long, TreeNode> longNodeHashMap = new HashMap<>();
        for(Node node : nodeCollection){
            TreeNode tempNode = null;
            TreeNode parentNode = null;
            //获取节点父节点id
            tempId = node.parentId;
            //判断父节点ID是否为空
            if( tempId != null ){
                //不为空则取到父节点
                parentNode = longNodeHashMap.get(tempId);
                //判断父节点是否存在
                if( parentNode!=null ){
                    //存在则加入父节点
                    tempNode = new TreeNode();
                    tempNode.id = node.id;
                    tempNode.parentId = node.parentId;
                    parentNode.children.add(tempNode);
                }else {
                    //不存在创建父节点，并加入父节点，并且把父节点存入hashmap
                    parentNode = new TreeNode();
                    tempNode = new TreeNode();
                    tempNode.id = node.id;
                    tempNode.parentId = tempId;
                    parentNode.id = tempId;
                    parentNode.children.add(parentNode);
                    longNodeHashMap.put(tempId,parentNode);
                }

            }else{
                //创建父节点
                parentNode = new TreeNode();
                parentNode.id = tempId;
                //此节点即为根节点
                root = parentNode;
                root.parentId = null;
                longNodeHashMap.put(tempId,parentNode);
            }
        }
        //把hashmap中所有父节点都加入根节点
        root.children.addAll(longNodeHashMap.values());
        return root ;
    }



}