package com.ikaimen.pattern.DeactorPattern.demo1;

/**
 * Created by ChenTao on 2017/8/25.
 *
 * 修饰成绩单
 */

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

    //首先要定义你要美化的方法
    private void reportHitghScore(){

        System.out.println("这次考试语文最高成绩：90，数学是88，英语是88");
    }

    //在家长看完成绩单，我再汇报学校的排名情况
    private void reportSort(){

        System.out.println("我的排名是38名");

    }

    //由于汇报的内容已经发生改变，那所以要重写父类
    @Override
    public void report(){
        this.reportHitghScore();

        super.report();

        this.reportSort();
    }
}
