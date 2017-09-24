package com.ikaimen.pattern.VisitorPattern.demo2;

/**
 * @Author: Mr.Chen
 *
 * @Description: 管理层类
 *
 * @Date: Created in 2017/9/24 下午6:01
 **/
public class Manager extends Employee {

    //这类人物的职责非常明确：业绩

    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {

        visitor.visit(this);

    }
}
