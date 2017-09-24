package com.ikaimen.pattern.VisitorPattern.demo2;


/**
 * @Author: Mr.Chen
 *
 * @Description:  访问者接口
 *
 * @Date: Created in 2017/9/24 下午6:16
 **/
public interface IVisitor {


    //首先，定义我可以访问普通员工

    public void visit(CommonEmployee commonEmployee);

    //其次，定义访问部门经理

    public void visit(Manager manager);


}
