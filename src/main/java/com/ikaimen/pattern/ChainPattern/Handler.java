package com.ikaimen.pattern.ChainPattern;

/**
 * Created by ChenTao on 2017/8/6.
 * 责任链模式抽象处理者
 *
 * 责任链模式的定义：
 * 使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。
 *
 * 责任链模式的优缺点：
 *
 * 优点
 *
 * 责任链模式非常显著的优点是将请求和处理分开。请求者可以不用知道是谁处理的，处理者可以不用知道请求的全貌（例如在J2EE项目开发中，可以剥离出无状态Bean由责任链处理）,
 * 两者解耦，提高系统的灵活性。
 *
 * 缺点
 *
 * 责任链有两个非常显著的缺点：一是性能问题，每个请求都是从链头遍历到链尾，特别是在链比较长的时候，性能是一个非常大的问题。二是调试很不方便，特别是链条比较长，环节比较多的时候
 * ，由于采用了类似递归的方式，调试的时候逻辑可能比较复杂。
 *
 * 责任链模式的注意事项
 *
 * 链中节点数量需要控制，避免出现超长链的情况，一般的做法是在Handler 中设置一个最大节点数量，在setNext方法中判断是否已经是超过其阈值，超过则不允许该链建立，避免无意识地破坏系
 * 统性能。
 *
 * 最佳实践
 * 在例子和通过源码中Handler是抽象类，融合了模板方法模式，每个实现类只要实现两个方法：echo 方法处理请求和getHandlerLevel获得处理级别，想想单一职责原则和迪米特法则，通过融合
 * 模板方法模式，各个实现类只需要关注的自己业务逻辑就成了，至于说什么事要自己处理，那就让父类去决定好了，也就是说父类实现了请求传递的功能，子类实现请求的处理，符合单一职责原则，各
 * 个实现类只完成一个动作或者逻辑，也就是只有一个原因引起类的改变，我建议大家在使用的时候用这种方法，好处是非常明显的了，子类的实现非常简单，责任链的建立也是非常灵活的。
 *
 * 责任链模式屏蔽了请求的处理过程，你发起一个请求到底是谁处理的，这个你不用关心，只要你把请求抛给责任链的第一个处理者，最终会返回一个处理结果（当然也可以不做任何处理），作为请求者
 * 可以不用知道到底是需要谁来处理的，这是责任链模式的核心，同时责任链模式也可以作为一种补救模式来使用。举个简单的例子，如项目开发的时候，需求确认是这样的：一个请求（如银行客户存款的
 * 币种），一个处理者（只处理人民币），但是随着业务的发展，处理者的数量和类型都有所增加，那这时候就可以在第一个处理者后面建立一个链，也就是责任链来处理请求，如果是人民币，好，还是第
 * 一个业务逻辑来处理；日元 ，欧元。。。这些都不用再对原有的业务逻辑产生很大改变，通过扩展实现类就可以很好的解决这些需求变更的问题。
 *
 * 责任链在实际的项目中使用也是比较多的，我曾经做过一个这样的项目，界面上有一个用户注册功能，注册用户分两种，一种是vip用户，也及时在该单位办理过业务的 ，一种是普通用户，一个用户的注册
 * 要填写一堆信息，VIP用户只要比普通用户多了一个输入项：VIP序列号。注册后还需激活，VIP和普通用户的激活流程也是不同的，VIP是自动发邮箱到用户的邮箱中就算激活了，普通用户要发送短信才能
 * 激活，为什么呢？获得手机好拿以后好发送 广告短信！项目组就采用了责任链模式，不管从前台传递过来的是VIP用户还是普通用户用户信息，统一传递到一个处理入口，通过责任链来完成任务处理。
 *
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;

    public final  static int HUSBAND_LEVEL_REQUEST = 2;

    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    //每个处理者都必须对请求做出处理

    public final Response handleMessage(Request request) {

        Response response = null;

        //判断是否是自己的处理级别
        if (this.getHandleLevel().getLevel().equals(request.getRequestLevel().getLevel())) {

            response = this.echo(request);
        } else {

            //不是自己的处理级别
            //判断是否右下一个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {

                //没有适当的处理者，业务自行处理
            }

        }
        return response;
    }

    //设置下一个处理者是谁
    public void setNext(Handler _handle){
        this.nextHandler = _handle;
    }
    //每个处理者都有一个处理级别
    protected abstract  Level getHandleLevel();

    //每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);


    public Handler(int level){

        this.level = level;

    }
}
