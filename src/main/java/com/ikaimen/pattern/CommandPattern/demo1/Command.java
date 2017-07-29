package com.ikaimen.pattern.CommandPattern.demo1;

/**
 * Created by ChenTao on 2017/7/29.
 *
 * 抽象命令类
 *
 */
public abstract class Command {

    //把组件定义好，子类可以直接使用

    protected RequirementGroup requirementGroup = new RequirementGroup();

    protected PageGroup pageGroup = new PageGroup();

    protected CodeGroup codeGroup = new CodeGroup();

    //只有一个方法，你需要我做什么事情
    public abstract void execute();

}
