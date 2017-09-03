package com.ikaimen.pattern.AdapterPattern.demo1;

import java.util.Map;

/**
 * @Author: Mr.Chen
 *
 * @Description: 适配器类
 *
 * @Date: Created in 2017-09-03 下午3:31
 **/
public class OuterUserInfo implements IUserInfo{


    //源目标对象

    private OuterUserBaseInfo outerUserBaseInfo;

    private OuterUserHomeInfo outerUserHomeInfo;

    private OuterUserOfficeInfo outerUserOfficeInfo;


    //数据处理

    private Map baseMap = null;

    private Map homeMap = null;

    private Map offeiceMap = null;


    public OuterUserInfo(OuterUserBaseInfo outerUserBaseInfo,OuterUserHomeInfo outerUserHomeInfo,OuterUserOfficeInfo outerUserOfficeInfo){


        this.outerUserBaseInfo = outerUserBaseInfo;

        this.outerUserHomeInfo = outerUserHomeInfo;

        this.outerUserOfficeInfo = outerUserOfficeInfo;

    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getHomeAddress() {
        return null;
    }

    @Override
    public String getMobileNumber() {
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getJobPosition() {
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}
