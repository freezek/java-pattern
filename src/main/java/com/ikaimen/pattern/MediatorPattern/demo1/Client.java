package com.ikaimen.pattern.MediatorPattern.demo1;

/**
 * Created by ChenTao on 2017/7/26.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {

        AbstractMediator mediator = new Mediator();

        //采购电脑

        System.out.println("-------采购人员采购电脑------");

        Purchase purchase = new Purchase(mediator);

        purchase.buyIBMcomputer(100);

        //销售电脑
        System.out.println("--------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);

        sale.sellIMBComputer(1);

        //管理库存

        System.out.println("----------库房管理人员清理库存-----------");

        Stock stock = new Stock(mediator);

        stock.clearStock();


    }

}
