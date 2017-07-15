package com.ikaimen.pattern.ProxyPattern.demo5;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ChenTao on 2017/7/15.
 * 动态代理的场景类
 */
public class Client {

    public static void main(String[] args) {

        //定义一个痴迷的玩家
        IGamePlayer player = (IGamePlayer) new GamePlayer("张三");
        player.getProxy();

        //定义一个handle
        InvocationHandler handler = new GamePlayIH(player);

        //开始打游戏，记下时间戳
        System.out.println("开始时间是："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()));

        //获得类的class loader

        ClassLoader cl = player.getClass().getClassLoader();

        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);

        //登录
        proxy.login("李四","123456");

        //杀怪

        proxy.killBoss();

        //升级
        proxy.upgrade();

        //记录结束游戏时间
        System.out.println("结束时间是："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()));


    }

}
