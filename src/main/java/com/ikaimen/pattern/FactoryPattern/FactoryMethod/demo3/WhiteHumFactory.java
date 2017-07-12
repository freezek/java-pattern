package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo3;

import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.Human;
import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.WhiteHuman;

/**
 * Created by Tom Chen on 2017/7/7.
 *
 * 生产白人工厂类
 */
public class WhiteHumFactory extends AbstractHumFactory {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
