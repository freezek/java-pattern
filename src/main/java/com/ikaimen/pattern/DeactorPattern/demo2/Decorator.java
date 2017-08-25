package com.ikaimen.pattern.DeactorPattern.demo2;

/**
 * Created by ChenTao on 2017/8/25.
 * 修饰的抽象类
 */
public class Decorator extends SchoolReport{

    //首先我需要知道是谁的成绩单

    private SchoolReport sr;

    public  Decorator(SchoolReport sr){

        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sgin(String name) {
        this.sr.sgin(name);
    }
}
