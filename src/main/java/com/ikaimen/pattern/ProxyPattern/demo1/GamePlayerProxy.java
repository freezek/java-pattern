package com.ikaimen.pattern.ProxyPattern.demo1;

/**
 * Created by ChenTao on 2017/7/15.
 * 普通代理的代理者
 */
public class GamePlayerProxy implements IGamePlayer {


    private IGamePlayer gamePlayer = null;

    //通过构造函数传递要对谁进行代练

    public GamePlayerProxy(String name){

        try {
            System.out.println(this);
            gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //代练登录
    @Override
    public void login(String user, String passwd) {
        this.gamePlayer.login(user,passwd);
    }

    //代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
