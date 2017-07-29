package com.ikaimen.pattern.CommandPattern.demo1;

/**
 * Created by ChenTao on 2017/7/29.
 * 抽象组
 */
public abstract class Group {

    //甲乙双方分开办公，如果你要和某一个组讨论，你首先要找到这个组

    public  abstract void find();

    //被要求增加的功能

    public abstract void add();

    //被要求删除的功能

    public abstract void delete();

    //被要求修改的功能

    public abstract void change();

    //被要求给出所有的变更计划

    public abstract  void plan();

    //每个接收者都要对直接执行的任务可以回滚

    public void rollBack(){
        //根据日志进行回滚
    }
}
