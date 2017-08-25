package com.ikaimen.pattern.DeactorPattern;

/**
 * Created by ChenTao on 2017/8/25.
 * 具体构建
 */
public class ConcreteComponent extends Component {
    //具体实现
    @Override
    public void operate() {

        System.out.println("do Something !");

    }
}
