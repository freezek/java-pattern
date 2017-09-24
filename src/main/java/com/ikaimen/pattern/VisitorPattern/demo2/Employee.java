package com.ikaimen.pattern.VisitorPattern.demo2;

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


    //我允许一个访问者访问

    public abstract void accept(IVisitor visitor);

}
