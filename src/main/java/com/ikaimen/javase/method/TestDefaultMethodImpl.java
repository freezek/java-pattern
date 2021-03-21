package com.ikaimen.javase.method;

/**
 * @ClassName TestDefaultMethodImpl
 * @Description
 * @Author Mr.Chen
 * @Date 2021/1/11 上午9:53
 * @Version V1.0
 **/
public class TestDefaultMethodImpl implements TestDefaultMethod{

//    @Override
//    public void test(){
//        System.out.println("child");
//    }


    public static void main(String[] args) {

        TestDefaultMethod testDefaultMethod = new TestDefaultMethodImpl();
        testDefaultMethod.test();
    }

    @Override
    public void testA() {
        System.out.println("hello child !");
    }
}
