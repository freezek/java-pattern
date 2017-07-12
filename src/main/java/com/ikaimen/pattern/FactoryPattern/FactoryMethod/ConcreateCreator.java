package com.ikaimen.pattern.FactoryPattern.FactoryMethod;

/**
 * Created by ChenTao on 2017/7/8.
 * 工厂方法模式实现类
 */
public class ConcreateCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> tClass) {

        Product product  = null;

        try {
            try {
                product = (Product) Class.forName(tClass.getName()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) product;
    }
}
