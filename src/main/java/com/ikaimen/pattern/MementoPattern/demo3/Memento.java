package com.ikaimen.pattern.MementoPattern.demo3;

import java.util.HashMap;

/**
 * @Author: Mr.Chen
 *
 * @Description: 备忘录角色
 *
 * @Date: Created in 2017/9/10 下午5:13
 **/
public class Memento {


    //接受HashMap作为状态

    private HashMap<String,Object> stateMap;

    //接受一个对象，建立一个备份

    public Memento(HashMap<String,Object> map){

        this.stateMap = map;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
