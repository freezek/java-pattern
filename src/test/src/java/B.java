package src.java;

/**
 * @Author: Mr.Chen
 * @Description:
 * @Date: Created in 2018/7/7 上午1:48
 **/
public class B implements A{

    private static   C c = new C(new B());

    @Override
    public String getUserName() {
        return "我是大B哥!";
    }

    public static void main(String[] args) {

         String s = c.callBack();

        System.out.println(s);
    }

}
