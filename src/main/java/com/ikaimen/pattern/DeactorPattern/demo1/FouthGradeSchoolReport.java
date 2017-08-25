package com.ikaimen.pattern.DeactorPattern.demo1;

/**
 * Created by ChenTao on 2017/8/25.
 * 四年级的成绩单
 */
public class FouthGradeSchoolReport extends SchoolReport{
    @Override
    public void report() {
        //成绩单的格式是这个样子
        System.out.println("尊敬的XXX家长：");
        System.out.println("-------------");
        System.out.println("语文 85 数学 82 英语 57");
        System.out.println("-------------");
        System.out.println("家长签名：");

    }

    @Override
    public void sgin(String name) {
        System.out.println("家长签名为："+name);
    }
}
