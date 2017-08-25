package com.ikaimen.pattern.DeactorPattern.demo2;

/**
 * Created by ChenTao on 2017/8/25.
 * 抽象成绩单
 */
public abstract class SchoolReport {


    //成绩单显示的就是你的成绩情况
    public abstract void report();

    //成绩单要家长签字
    public abstract void sgin(String name);

}
