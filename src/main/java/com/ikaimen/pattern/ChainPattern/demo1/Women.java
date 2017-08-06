package com.ikaimen.pattern.ChainPattern.demo1;

/**
 * Created by ChenTao on 2017/8/6.
 * 古代女性
 */
public class Women implements IWomen{

    /**
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     *
     * @return
     */

    private int type = 0;

    //妇女的请示
    private String request = " ";

    //构造函数传递过来的请求
    public Women (int type,String _request){

        this.type = type;
        switch (this.type){

            case 1:
                this.request = "女儿的请求是："+_request;
                break;
            case 2:
                this.request = "妻子的请求是："+_request;
                break;
            case 3:
                this.request = "母亲的请求是：" +_request;
                break;

        }

    }

    //获得自己的状况
    @Override
    public int getType() {
        return this.type;
    }

    //获得妇女的请求
    @Override
    public String getReuest() {
        return this.request;
    }
}
