package com.ikaimen.pattern.BuilderPattern.demo1;

import java.util.ArrayList;

/**
 * Created by ChenTao on 2017/7/12.
 * 车辆模型抽象类
 */
public abstract class CarModel {

    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    protected  abstract  void start();

    protected  abstract void stop();

    protected  abstract  void alarm();

    protected  abstract  void engineBoom();

    final public  void run(){

        for(int u=0;u<this.sequence.size();u++){
            String actionName = this.sequence.get(u);
            if(actionName.equals("start")){
                this.start();
            }else if(actionName.equals("stop")){
                this.stop();
            }else if(actionName.equals("alarm")){
                this.alarm();
            }else if(actionName.equals("engineBoom")){
                this.engineBoom();
            }

        }
    }

    final  public  void setSequence(ArrayList<String> sequence){

        this.sequence = sequence;

    }

}
