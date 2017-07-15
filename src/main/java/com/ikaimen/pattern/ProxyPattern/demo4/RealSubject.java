package com.ikaimen.pattern.ProxyPattern.demo4;

import com.ikaimen.pattern.ProxyPattern.Subject;

/**
 * Created by ChenTao on 2017/7/15.
 * 真实主题类
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        //业务处理逻辑
    }
}
