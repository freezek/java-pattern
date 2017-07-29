package com.ikaimen.pattern.CommandPattern.demo1;

/**
 * Created by ChenTao on 2017/7/29.
 * 删除页面的命令
 */
public class DeletePageCommand extends Command{

    //执行删除一个页面的命令
    @Override
    public void execute() {
        //找到页面组
        super.pageGroup.find();

        //删除一个页面

        super.pageGroup.delete();

        //给出计划

        super.pageGroup.plan();


    }
}
