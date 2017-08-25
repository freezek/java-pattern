package com.ikaimen.pattern.DeactorPattern.demo2;

/**
 * Created by ChenTao on 2017/8/25.
 * 排名情况修饰
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //告诉家长的排名情况

    private void reportHighScore(){
        System.out.println("这次考试语文最高成绩：90，数学是88，英语是88");
    }

    @Override
    public void report(){

        super.report();

        this.reportHighScore();

    }
}
