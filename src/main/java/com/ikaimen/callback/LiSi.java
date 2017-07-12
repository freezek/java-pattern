package com.ikaimen.callback;

/**
 * Created by Tom Chen on 2017/7/7.
 */
public class LiSi {

    private  ZhangSan zhangSan;

    public  void HaveRest(final ZhangSan zhangSan){

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是李四，正在工作！");
                try {
                    Thread.sleep(10000);
                    zhangSan.doSomething();
                    System.out.println("我没有休眠吗？");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new MyThread().start();
        new MyThread2().run();//注意：start（） 方法是指让线程进入就绪状态等待cpu调用，run（）是直接对线程进行调用，所以要想达到多线程并发的效果，必须使用start()方法

    }

}

class MyThread extends Thread{
    @Override
    public void run() {
       for (int i=0;i<10;i++){
           System.out.println("我是李四"+i+"号的秘书。。。");
       }
        try {
            Thread.sleep(5000);
            System.out.println("线程一休眠完毕！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //super.run();
    }
}

class MyThread2 implements  Runnable{
    @Override
    public void run() {

        for (int i=0;i<10;i++){
            System.out.println("我是李四"+i+"号的员工。。。");
        }
        try {
            Thread.sleep(5000);
            System.out.println("我在什么时候休眠！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}