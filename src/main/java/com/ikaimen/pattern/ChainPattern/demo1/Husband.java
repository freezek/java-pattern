package com.ikaimen.pattern.ChainPattern.demo1;

/**
 * Created by ChenTao on 2017/8/6.
 * 丈夫类
 */
public class Husband extends Handler{
    //丈夫的答复
    @Override
    protected void response(IWomen women) {

        System.out.println("----妻子向丈夫请示----");

        System.out.println(women.getReuest());

        System.out.println("丈夫的答复是：同意\n");
    }
    //丈夫只处理妻子的请求
    public Husband(){

        super(Handler.HUSBAND_LEVEL_REQUEST);
    }
}
