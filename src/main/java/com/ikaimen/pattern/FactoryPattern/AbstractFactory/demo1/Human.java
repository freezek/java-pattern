package com.ikaimen.pattern.FactoryPattern.AbstractFactory.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 人种接口
 */
public interface Human {
    //每个人种都有相应的颜色
    public void getColor();

    //每个人种都会说话
    public void talk();

    //每个人种都有性别
    public void getSex();
}
