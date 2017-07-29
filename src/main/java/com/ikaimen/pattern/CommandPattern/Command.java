package com.ikaimen.pattern.CommandPattern;

/**
 * Created by ChenTao on 2017/7/29.
 *
 * 命令模式
 *
 * 命令模式的定义
 *
 * 将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录日志，可以提供命令的撤销的恢复功能。
 *
 * 命令模式的优点
 *
 * 类间解耦
 * 调用者角色与接收者角色没有任何依赖关系，调用者实现功能时只须调用Command抽象类的execute方法就可以，不需要了解到底哪个接收者执行。
 *
 * 可扩展性
 * Command的子类可以非常容易地扩展，而调用者Invoker 和高层次的模块Client不产生严重的diamante耦合
 *
 * 命令模式结合其他模式会更优秀
 * 命令模式可以结合责任链模式，实现命令族解析任务；结合模板方法模式，则可以减少Command子类的膨胀问题。
 *
 * 命令模式的缺点
 *
 * 命令模式也是有缺点的，请看Command的子类，如果有N个命令，问题就出来了，Command 的子类可不是几个，而是N个，这个类膨胀得非常大，这个就需要读者在项目中慎重考虑使用。
 *
 * 命令模式的使用场景
 *
 * 只要你认为是命令的地方就可以采用命令模式，例如，在GUI开发中，一个按钮的点击是一个命令，可以采用命令模式；模拟DOS命令的时候，当然也要采用命令模式；触发一反馈机制处理等。
 *
 *
 *
 */
public abstract class Command {

    //定义一个子类的全局共享变量
    protected final Receiver receiver;

    //实现类必须定义一个接收者

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    //每个命令类都必须有一个执行命令的方法

    public abstract void execute();
}
