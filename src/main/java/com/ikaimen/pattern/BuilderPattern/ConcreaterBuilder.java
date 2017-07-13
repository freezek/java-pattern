package com.ikaimen.pattern.BuilderPattern;

/**
 * Created by ChenTao on 2017/7/12.
 * 具体建造者
 */
public class ConcreaterProduct extends Builder {

    private  Product product = new Product();

    @Override
    public void setPart() {
        /**
         * 产品类的逻辑处理
         */
    }
    //组建一个产品
    @Override
    public Product buildProduct() {
        return product;
    }
}
