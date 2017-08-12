package com.ikaimen.pattern.ChainPattern;

/**
 * Created by ChenTao on 2017/8/6.
 * 请求类
 */
public class Request {

    private Level level ;

    public Request(){}

    public Request(Level level) {
        this.level = level;
    }



    public Level getRequestLevel(){

        return this.level;
    }
}
