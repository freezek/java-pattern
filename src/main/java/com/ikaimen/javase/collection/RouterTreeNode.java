package com.ikaimen.javase.collection;

import lombok.Data;

import java.util.Comparator;
import java.util.Objects;


/**
 * @author Mr.Chen
 * @describe 文科路由树
 * @date 2020年11月12日 3:35 下午
 */
@Data
public class RouterTreeNode implements Comparable<RouterTreeNode> {

    /**
     * 元素ID
     */
    private String id;
    /**
     * 元素名
     */
    private String name;
    /**
     * 所在层级
     */
    private String level;
    /**
     * 状态
     */
    private String status;
    /**
     * 序号
     */
    private int sequence;

    /**
     * 父节点ID 值为 0 则为根节点
     */
    private String parentId;

    public RouterTreeNode(String id, String name, String level, String status, int sequence, String parentId) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.status = status;
        this.sequence = sequence;
        this.parentId = parentId;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RouterTreeNode)) {
            return false;
        }
        RouterTreeNode node = (RouterTreeNode) o;
        return getId().equals(node.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    @Override
    public int compareTo(RouterTreeNode o) {
        return this.getSequence() - o.getSequence();
    }
}
