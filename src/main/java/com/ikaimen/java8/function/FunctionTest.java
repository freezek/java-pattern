package com.ikaimen.java8.function;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

/**
 * @ClassName FunctionTest
 * @Description
 * @Author Mr.Chen
 * @Date 2021/4/9 下午8:49
 * @Version V1.0
 **/
public class FunctionTest {


    @Test
    public void test() throws InstantiationException, IllegalAccessException {

        String a = "A";
        String b = "B";

        String result = execute(TestImpl.class, test -> test.testB(a, b));

        System.out.println(result);

    }

    private <R, T> R execute(Class<T> targetClz, Function<T, R> exeFunction) throws IllegalAccessException, InstantiationException {

        T t = targetClz.newInstance();

        return exeFunction.apply(t);
    }
}
