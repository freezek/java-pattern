package com.ikaimen.javase.method;

/**
 * @ClassName TestDefaultMethod
 * @Description
 * @Author Mr.Chen
 * @Date 2021/1/11 上午9:52
 * @Version V1.0
 **/
public interface TestDefaultMethod {

    default void test(){
        this.testA();
    }

    void testA();
}
