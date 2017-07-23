package com.ikaimen.pattern.PrototypePattern.demo1;

/**
 * Created by ChenTao on 2017/7/23.
 * 广告信模板代码
 */
public class AdvTemplate {

    //广告信名称
    private String advSuject = "XX银行信用卡抽奖活动";
    //广告信内容
    private String advContent = "国庆抽奖活动通知：只要刷卡就送你一百万！。。。";


    public String getAdvSuject() {
        return advSuject;
    }

    public void setAdvSuject(String advSuject) {
        this.advSuject = advSuject;
    }

    public String getAdvContent() {
        return advContent;
    }

    public void setAdvContent(String advContent) {
        this.advContent = advContent;
    }
}
