package com.ikaimen.pattern.VisitorPattern.demo1;

/**
 * @Author: Mr.Chen
 *
 * @Description: 抽象员工类
 *
 * @Date: Created in 2017/9/24 下午5:47
 **/
public abstract class Employee {

    public final static int MAlE = 0 ;// 0 代表是男性

    public final static int FEMALE = 1; //1 代表是女性

    //员工姓名

    private String name ;

    //员工工资

    private int salary;

    //性别很重要

    private int sex ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    //打印员工的信息

    public final void report(){

        String info = "姓名："+ this.name +"\t";

        info = info + "性别："+ (this.sex == FEMALE ? "女":"男") + "\t";

        info = info + "薪水" + this.salary + "\t";

        //获得员工的其他信息
        info = info + this.getOtherInfo();

        System.out.println(info);


    }

    //拼装员工的其他信息

    protected  abstract  String getOtherInfo();

}
