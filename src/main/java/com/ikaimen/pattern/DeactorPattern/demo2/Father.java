package com.ikaimen.pattern.DeactorPattern.demo2;

/**
 * Created by ChenTao on 2017/8/25.
 *
 * 家长类
 */
public class Father {

    public static void main(String[] args) {

        SchoolReport sr ;

        sr = new FouthGradeSchoolReport();

        sr = new HighScoreDecorator(sr);

        sr = new SortDecorator(sr);

        sr.report();

        sr.sgin("家长");

    }
}
