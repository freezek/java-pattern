package com.ikaimen.pattern.MediatorPattern.demo1;

import com.ikaimen.pattern.MediatorPattern.demo1.AbstractColleague;
import com.ikaimen.pattern.MediatorPattern.demo1.AbstractMediator;

import java.util.Random;

/**
 * Created by ChenTao on 2017/7/26.
 *
 * 销售管理类
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    //销售IBM电脑

    public void sellIMBComputer(int number){

        super.mediator.execute("sale.sell",number);

        System.out.println("销售IBM电脑"+number+"台");

    }

    //反馈销售情况，0~100之间变化，0代表没人买，100代表非常畅销

    public int getSaleState(){

        Random random = new Random(System.currentTimeMillis());

        int saleStatus = random.nextInt(100);

        System.out.println("IBM电脑的销售情况为："+saleStatus);

        return saleStatus;

    }

    //折价处理

    public void offSale(){

        super.mediator.execute("sale.offsell");
    }
}
