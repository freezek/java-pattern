package com.ikaimen.pattern.BuilderPattern.demo1;

import java.util.ArrayList;

/**
 * Created by ChenTao on 2017/7/13.
 * 奔驰车组装者
 */
public class BenzBuilder  extends CarBuilder{

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
