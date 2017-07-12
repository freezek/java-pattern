package com.ikaimen.callback;

/**
 * Created by Tom Chen on 2017/7/7.
 */
public class MyCallBack implements ZhangSan {

    private MyCallBack myCallBack;

    @Override
    public void doSomething() {
        System.out.println("我需要实现回调。。。。。");
    }

    public static void main(String[] args) {
        LiSi liSi = new LiSi();
        liSi.HaveRest(new MyCallBack());

    }

}
