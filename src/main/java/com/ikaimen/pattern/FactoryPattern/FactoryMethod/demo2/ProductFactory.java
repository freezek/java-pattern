package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo2;

import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.BlackHuman;
import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.Human;
import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.WhiteHuman;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tom Chen on 2017/7/7.
 *
 * 延迟加载的工厂类
 */
public class ProductFactory {


    private static final Map<String,Human> map = new HashMap<String,Human>();

    public static synchronized Human createHuman(String type){

        Human whiteHuman = null;
        if(map.containsKey(type)){
            return map.get(type);
        }else {
            if(type.equals("whiteHuman")){
                whiteHuman = new WhiteHuman();
            }else {
                whiteHuman = new BlackHuman();
            }
        }
        map.put(type,whiteHuman);
        return whiteHuman;
    }
}
