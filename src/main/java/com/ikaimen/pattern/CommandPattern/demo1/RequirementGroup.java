package com.ikaimen.pattern.CommandPattern.demo1;

/**
 * Created by ChenTao on 2017/7/29.
 * 需求组
 */
public class RequirementGroup  extends Group{

    //客户要求需求组去和他们谈
    @Override
    public void find() {
        System.out.println("找到需求组。。。。");
    }
    //客户要求增加一项需求
    @Override
    public void add() {
        System.out.println("客户要求增加一项需求。。。");
    }
    //客户要求删除一项需求
    @Override
    public void delete() {
        System.out.println("客户要求删除一项需求。。。");
    }
    //客户要去修改一项需求
    @Override
    public void change() {
        System.out.println("客户要求删除一项需求。。。");
    }
    //客户要去给出变更计划
    @Override
    public void plan() {
        System.out.println("客户要求需求变更计划。。。");
    }
}
