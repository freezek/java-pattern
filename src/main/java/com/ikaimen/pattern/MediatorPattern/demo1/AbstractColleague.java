package com.ikaimen.pattern.MediatorPattern.demo1;

/**
 * Created by ChenTao on 2017/7/26.
 * 抽象同事类
 */
public  abstract class AbstractColleague {

    protected  AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator){

        this.mediator = mediator;

    }

}
