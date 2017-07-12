package com.ikaimen.pattern.FactoryPattern.FactoryMethod.demo1;

/**
 * Created by ChenTao on 2017/7/8.
 * 人类创建工厂
 */
public class HumanFactory extends  AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {


        //定义一个生产的人种
        Human human = null;

        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("生产异常！");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("生产异常！");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("生产异常！");
            e.printStackTrace();
        }


        return (T) human;
    }
}
