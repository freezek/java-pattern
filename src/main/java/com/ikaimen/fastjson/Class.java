package com.ikaimen.fastjson;

/**
 * @ClassName Class
 * @Description TODO
 * @Author chentao
 * @Date 2019/6/29 3:39 PM
 * @ModifyDate 2019/6/29 3:39 PM
 * @Version 1.0
 */
public class Class {

    private int num;

    private String name;

    private int grade;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Class{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
