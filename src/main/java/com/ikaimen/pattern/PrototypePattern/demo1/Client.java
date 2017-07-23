package com.ikaimen.pattern.PrototypePattern.demo1;

import java.util.Random;

/**
 * Created by ChenTao on 2017/7/23.
 * 原型模式场景类
 */
public class Client {

    //发送账单的数量，从数据库获取

    private static int MAX_COUNTt = 6;

    public static void main(String[] args) {

        //模拟发送邮件
        int i = 0;

        //把模板定义出来，这个是从数据库获取

        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("中国银行版权所有！");

        while (i<MAX_COUNTt){
            //以下是每封邮件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5)+"先生（女士）");
            cloneMail.setReciver(getRandString(5)+"@"+getRandString(8)+".com");
            //然后发送邮件
            sendMail(cloneMail);
            i++;
        }

    }

    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject()+"\t收件人"+mail.getReciver()+"\t...发送成功！");
    }

    //获取指定长度的随机字符串

    public static String getRandString(int maxLength){

        String source = "sjkdgjksgdkasdfkjhasdfjkhaksjdfhajkdsfhjasdfhjoadfh";

        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){

            sb.append(source.charAt(rand.nextInt(source.length())));

        }
        return sb.toString();
    }


}
