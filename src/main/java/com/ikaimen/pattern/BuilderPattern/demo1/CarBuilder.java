package com.ikaimen.pattern.BuilderPattern.demo1;

import java.util.ArrayList;

/**
 * Created by ChenTao on 2017/7/13.
 * 抽象汽车组装者
 */
public  abstract  class CarBuilder {

    public abstract  void setSequence(ArrayList<String> sequence);

    public abstract  CarModel getCarModel();
}
