package com.ikaimen.pattern.ProxyPattern.demo1;

/**
 * Created by ChenTao on 2017/7/15.
 * 普通代理的游戏者
 */
public class GamePlayer implements IGamePlayer{

    private String name = " ";

    //构造函数限制谁能创建对象，并同事传递姓名

    public GamePlayer(IGamePlayer _gamePlayer,String name) throws Exception {

        if (_gamePlayer==null){
            throw new Exception("不能创建真实角色");
        }else {

            this.name = name;

        }
    }

    //登录
    @Override
    public void login(String user, String passwd) {
        System.out.println("登录名为："+user+"的用户"+this.name+"登录成功！");
    }
    //打怪
    @Override
    public void killBoss() {
        System.out.println(this.name+"在打怪！");
    }
    //升级
    @Override
    public void upgrade() {
        System.out.println(this.name + "升级了！");
    }
}
