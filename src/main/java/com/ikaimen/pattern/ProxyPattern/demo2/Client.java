package com.ikaimen.pattern.ProxyPattern.demo2;

/**
 * Created by ChenTao on 2017/7/15.
 * 强制代理真实类
 */
public class Client  {

    public static void main(String[] args) {

        IGamePlayer player = new GamePlayer("张三");

        IGamePlayer proxy = new GamePlayerProxy(player);

        player.getProxy();

        proxy.login("李四","张三");

        proxy.killBoss();

        proxy.upgrade();




    }

}
