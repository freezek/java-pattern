package com.ikaimen.pattern.CommandPattern.demo1;

/**
 * Created by ChenTao on 2017/7/29.
 * 增加需求的命令
 */
public class AddRequirementCommand extends Command{

    //执行增加一项需求的命令
    @Override
    public void execute() {
        //找到需求组

        super.requirementGroup.find();

        //增加需求

        super.requirementGroup.add();

        //给出计划

        super.requirementGroup.plan();

    }
}
