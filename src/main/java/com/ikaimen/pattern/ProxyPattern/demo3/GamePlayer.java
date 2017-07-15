package com.ikaimen.pattern.ProxyPattern.demo3;


/**
 * Created by ChenTao on 2017/7/15.
 * 强制代理的真实角色
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy = null;

    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String user, String passwd) {
        if(this.isProxy()){
            System.out.println("登录名为："+user+"的客户"+this.name+"登录成功！");
        }else {
            System.out.println("请使用指定的代理访问！");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name+"在打怪！");
        }else {
            System.out.println("请使用指定的代理访问！");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name+"又升级了！");
        }else {
            System.out.println("请使用指定的代理访问！");
        }
    }

    @Override
    public IGamePlayer getProxy() {

        this.proxy = new GamePlayerProxy(this);




        return this.proxy;
    }

    private boolean isProxy(){


        if(this.proxy==null){
            return false;
        }else {
            return true;
        }

    }
}
