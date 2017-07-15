package com.ikaimen.pattern.ProxyPattern.demo5;

/**
 * Created by ChenTao on 2017/7/15.
 * 强制代理的接口类
 */
public interface IGamePlayer {

    //登录游戏
    public void login(String user, String passwd);

    public void killBoss();

    public  void upgrade();


    //每个人都可以找自己的代理
    public IGamePlayer getProxy();

}
