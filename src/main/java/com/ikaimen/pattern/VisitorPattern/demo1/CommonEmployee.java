package com.ikaimen.pattern.VisitorPattern.demo1;

/**
 * @Author: Mr.Chen
 *
 * @Description: 普通员工类
 *
 * @Date: Created in 2017/9/24 下午5:58
 **/
public class CommonEmployee extends Employee{


    //工作内容

    private  String job ;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    protected String getOtherInfo() {

        return "工作："+ this.job+"\t";
    }
}
