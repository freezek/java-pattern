package com.ikaimen.pattern.ChainPattern;

/**
 * Created by ChenTao on 2017/8/6.
 * 具体处理者
 */
public class ConcreteHander3 extends Handler{

    //设置自己的处理级别
    @Override
    protected Level getHandleLevel() {
        return null;
    }
    //设置自己的处理逻辑
    @Override
    protected Response echo(Request request) {
        return null;
    }
}
