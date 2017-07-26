package com.ikaimen.pattern.MediatorPattern.demo1;

import com.ikaimen.pattern.MediatorPattern.demo1.AbstractColleague;
import com.ikaimen.pattern.MediatorPattern.demo1.AbstractMediator;

/**
 * Created by ChenTao on 2017/7/26.
 * 采购管理类
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {

        super(mediator);
    }

    //采购IBM电脑

    public  void buyIBMcomputer(int number){

        super.mediator.execute("purchase.buy",number);

    }

    //不再采购IMB电脑

    public void refuseBuyIBM(){

        System.out.println("不再采购IBM电脑");
    }

}
