package com.ikaimen.pattern.VisitorPattern;

/**
 * @Author: Mr.Chen
 *
 * @Description: 具体访问者
 *
 * @Date: Created in 2017/9/24 下午6:51
 **/
public class Visitor implements IVisitor{
    @Override
    public void visit(ConcreteElement1 element1) {
        element1.doSomthing();
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        element2.doSomthing();
    }
}
