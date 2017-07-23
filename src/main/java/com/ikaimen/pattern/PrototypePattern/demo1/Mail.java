package com.ikaimen.pattern.PrototypePattern.demo1;

/**
 * Created by ChenTao on 2017/7/23.
 * 邮件类代码
 */
public class Mail implements Cloneable{
    //收件人
    private String reciver;
    //邮件名称

    private String subject;

    //称谓
    private String appellation;
    //邮件内容
    private String  centext;

    //邮件署名
    private String tail;

    //构造函数
    public Mail(AdvTemplate advTemplate){

        this.centext = advTemplate.getAdvContent();
        this.subject = advTemplate.getAdvSuject();

    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getCentext() {
        return centext;
    }

    public void setCentext(String centext) {
        this.centext = centext;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public Mail clone()  {

        Mail mail = null;

        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return mail;
    }
}
