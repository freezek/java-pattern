package com.ikaimen.pattern.DeactorPattern.demo1;

/**
 * Created by ChenTao on 2017/8/25.
 * 家长类
 */
public class Father {

    public static void main(String[] args) {


        //把美化过的成绩单拿过来

        SchoolReport schoolReport = new SugarFouthGradeSchoolReport();

        //看成绩单

        schoolReport.report();

        //家长签名

        schoolReport.sgin("家长");


    }
}
