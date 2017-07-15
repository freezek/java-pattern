package com.ikaimen.pattern.ProxyPattern.demo3;


/**
 * Created by ChenTao on 2017/7/15.
 * 强制代理真实类
 */
public class Client {

    public static void main(String[] args) {

        IGamePlayer player = new GamePlayer("王五");

        IGamePlayer proxy = new GamePlayerProxy(player);

        player.getProxy();

        proxy.login("李四","123456");

        proxy.killBoss();

        proxy.upgrade();




    }

}
