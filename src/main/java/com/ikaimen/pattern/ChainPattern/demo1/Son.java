package com.ikaimen.pattern.ChainPattern.demo1;

/**
 * Created by ChenTao on 2017/8/6.
 * 儿子类
 */
public class Son extends Handler{
    //儿子的答复
    @Override
    protected void response(IWomen women) {

        System.out.println("----母亲向儿子请示----");

        System.out.println(women.getReuest());

        System.out.println("儿子的答复是：同意\n");
    }
    //儿子只处理母亲的请求
    public Son(){

        super(Handler.SON_LEVEL_REQUEST);
    }
}
