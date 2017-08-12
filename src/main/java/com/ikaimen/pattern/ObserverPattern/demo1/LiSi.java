package com.ikaimen.pattern.ObserverPattern.demo1;

/**
 * Created by ChenTao on 2017/8/12.
 * 李四
 */
public class LiSi implements ILiSi{

    //李四是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
    @Override
    public void update(String context) {

        System.out.println("李四：观察到韩非子活动，开始向老板汇报了。。。");

        this.reportToBoss(context);

        System.out.println("李四：汇报完毕。。。");
    }

    //汇报给老板

    private void reportToBoss(String reportContext){

        System.out.println("李四：报告，老板！韩非子有活动了------>"+reportContext);

    }
}
