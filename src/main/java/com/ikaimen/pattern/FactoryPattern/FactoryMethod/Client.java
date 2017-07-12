package com.ikaimen.pattern.FactoryPattern.FactoryMethod;

/**
 * Created by ChenTao on 2017/7/8.
 * 工厂方法测试
 */
public class Client {

    public static void main(String[] args) {

        Creator creator = new ConcreateCreator();

        Product product1 = creator.createProduct(ConcreateProduct1.class);

        product1.method();
        product1.method2();

        Product product2 = creator.createProduct(ConcreateProduct2.class);

        product2.method();
        product2.method2();

    }
}
