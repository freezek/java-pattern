package com.ikaimen.pattern.MediatorPattern;

/**
 * Created by ChenTao on 2017/7/26.
 * 抽象同事类
 */
public class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){

        this.mediator=mediator;
    }
}
