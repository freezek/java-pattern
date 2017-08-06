package com.ikaimen.pattern.ChainPattern.demo1;

/**
 * Created by ChenTao on 2017/8/6.
 * 女性接口
 */
public interface IWomen {

    //获得个人状况
    public int getType();

    //获得个人请示，你要干什么？出去逛街？约会？还是看电影？

    public String getReuest();
}
