package com.ikaimen.pattern.ProxyPattern.demo1;

/**
 * Created by ChenTao on 2017/7/15.
 * 普通代理的场景类
 */
public class Client {

    public static void main(String[] args) {

        IGamePlayer proxy = new GamePlayerProxy("张三");

        proxy.login("李四","123456");

        proxy.killBoss();

        proxy.upgrade();
    }
}
