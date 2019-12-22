package com.ikaimen.javase.exception;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @ClassName TestException
 * @Description TODO
 * @Author chentao
 * @Date 2019/9/21 3:31 下午
 * @ModifyDate 2019/9/21 3:31 下午
 * @Version 1.0
 */
public class TestException {

    public static void main(String[] args) {

        int a = 10 ;
        try {
            testException();

        } catch (DemoException e) {

            a = 11;

            try {
                testException();
            } catch (DemoException ex) {
                ex.printStackTrace();
            }finally {
                System.out.println(a);
            }
            e.printStackTrace();
        }

        System.out.println(a);
    }


    private static void testException() throws DemoException{

        System.out.println(" self identify exception ! ");

        if (true){

            throw new DemoException("self exception !",new IOException());
        }
    }

}
