package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo3;

import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.BlackHuman;
import com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1.Human;

/**
 * Created by Tom Chen on 2017/7/7.
 */
public class BlackHumanFactory extends AbstractHumFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
