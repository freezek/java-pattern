package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo3;

import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.Human;
import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.YellowHuman;

/**
 * Created by Tom Chen on 2017/7/7.
 * 黄种人工厂类
 */
public class YellowHumanFactory extends AbstractHumFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
