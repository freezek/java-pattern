package com.ikaimen.pattern.BuilderPattern.demo1;

import java.util.ArrayList;

/**
 * Created by ChenTao on 2017/7/13.
 * 导演类
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<String>();

    private BenzBuilder benzBuilder  = new BenzBuilder();

    private  BWMBuilder bwmBuilder  = new BWMBuilder();

    public BenzModel getBenzModel(){

        this.sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        sequence.add("engineBoom");
        sequence.add("alarm");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();

    }

}
