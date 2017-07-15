package com.ikaimen.pattern.ProxyPattern.demo2;

/**
 * Created by ChenTao on 2017/7/15.
 * 强制代理的代理类
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    //构造函数传递用户名
    public GamePlayerProxy(IGamePlayer name){

        try {
            System.out.println(this);
            gamePlayer =  name;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String passwd) {
        this.gamePlayer.login(user,passwd);

    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();

    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();

    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
