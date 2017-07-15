package com.ikaimen.pattern.ProxyPattern.demo5;



/**
 * Created by ChenTao on 2017/7/15.
 * 代理类
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {

    private IGamePlayer gamePlayer = null;

    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void count() {
        System.out.println("本次升级费用是50元！");
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
        count();
    }

    @Override
    public IGamePlayer getProxy() {
        return null;
    }
}
