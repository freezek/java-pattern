package com.ikaimen.pattern.ChainPattern;

/**
 * Created by ChenTao on 2017/8/6.
 * 具体处理者
 */
public class ConcreteHander1 extends Handler{

    private Level handlelevel = new Level("1");

    //设置自己的处理级别
    @Override
    protected Level getHandleLevel() {
        return this.handlelevel;
    }
    //设置自己的处理逻辑
    @Override
    protected Response echo(Request request) {

        System.out.println("我处理了等级一的请求！");

        return null;
    }

    public ConcreteHander1(){

        super(Handler.FATHER_LEVEL_REQUEST);
    }
}
