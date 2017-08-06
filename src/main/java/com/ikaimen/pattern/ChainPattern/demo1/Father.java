package com.ikaimen.pattern.ChainPattern.demo1;

/**
 * Created by ChenTao on 2017/8/6.
 * 父亲类
 */
public class Father extends Handler{
    //父亲的答复
    @Override
    protected void response(IWomen women) {

        System.out.println("----女儿向父亲请示----");

        System.out.println(women.getReuest());

        System.out.println("父亲的答复是：同意\n");
    }
    //父亲只处理女儿的请求
    public Father(){

        super(Handler.FATHER_LEVEL_REQUEST);
    }
}
