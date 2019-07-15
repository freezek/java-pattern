package src.java;

/**
 * @Author: Mr.Chen
 * @Description:
 * @Date: Created in 2018/7/7 上午1:49
 **/
public class C {

    public A a;

    public C(A a) {
        this.a = a;
    }

    public String callBack(){

        T t = new T();
        Thread thread = new Thread(t);
        thread.start();

        return "我是回调函数！";
    }


    class T implements Runnable{


        @Override
        public void run() {

//            try {
//                //Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println( "异步执行------"+  a.getUserName());

        }
    }


}
