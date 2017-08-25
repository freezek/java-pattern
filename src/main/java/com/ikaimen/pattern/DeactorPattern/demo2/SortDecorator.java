package com.ikaimen.pattern.DeactorPattern.demo2;

/**
 * Created by ChenTao on 2017/8/25.
 * 排名情况修饰
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    //告诉家长的排名情况

    private void reportSort(){
        System.out.println("我的排名是38");
    }

    @Override
    public void report(){

        super.report();

        this.reportSort();

    }
}
