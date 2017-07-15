package com.ikaimen.pattern.ProxyPattern.demo1;

/**
 * Created by ChenTao on 2017/7/15.
 * 普通代理
 */
public interface IGamePlayer {

    public void login(String user,String passwd);

    public void killBoss();

    public void upgrade();

}
