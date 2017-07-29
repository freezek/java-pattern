package com.ikaimen.pattern.CommandPattern.demo1;

/**
 * Created by ChenTao on 2017/7/29.
 * 撤销命令
 */
public class CancelDeleteCommand extends Command{

    //撤销删除一个页面的命令
    @Override
    public void execute() {
        super.pageGroup.rollBack();
    }
}
