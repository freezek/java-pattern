package com.ikaimen.pattern.SingletonPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Tom Chen on 2017/7/7.
 * 单利模式的扩展--指定数量的多例模式
 * 例如在实际生产环境中设置多个实例进行对文件的读操作
 */
public class EmperorExtend {

    //定义最多能产生的实例数量
    private static  final int  MAX_NUM = 5;
    //每个对象都有名字，使用arryList来记录每个对象的私有属性
    private static ArrayList<String> arrayList = new ArrayList<String>();
    //定义一个列表容纳所有的实例
    private static  ArrayList<EmperorExtend> list = new ArrayList<EmperorExtend>();
    private static  int countNumOfEmperor;
    static {
        for (int i=0;i<MAX_NUM;i++){
            list.add(new EmperorExtend("实例："+i));
        }
    }
    private  EmperorExtend(){}
    private  EmperorExtend(String string){
        arrayList.add(string);
    }
    public static EmperorExtend getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(MAX_NUM);
        return  list.get(countNumOfEmperor);
    }
    public void say(){
        System.out.println(arrayList.get(countNumOfEmperor));
    }

    public static void main(String[] args) {

      for (int i=0;i<5;i++){

          EmperorExtend emperorExtend = EmperorExtend.getInstance();
          emperorExtend.say();

      }

    }

}
