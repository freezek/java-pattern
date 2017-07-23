package com.ikaimen.pattern.PrototypePattern;

/**
 * Created by ChenTao on 2017/7/23.
 * 原型模式
 *
 * 定义：
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * 原型模式的优缺点：
 *
 * 性能优良
 * 原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一个循环体内产生大量的对象时，原型模式可以更好的体现其优点。
 * 逃避构造函数的约束
 * 这既是他的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的。优点是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑。
 *
 * 原型模式的使用场景：
 *
 * 资源优化场景
 * 类初始化需要消耗非常多的资源，这个资源包括数据，硬件资源等。
 *
 * 性能和安全要求的场景
 * 通过new产生一个对象需要非常繁琐的数据准备货访问权限，则可以使用原型模式。
 *
 * 一个对象多个修改者的场景
 * 一个对象需要提供给其他对象访问，而且各个调用者可以能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。
 *
 * 在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的方法创建有一个对象，然后由工厂方法提供给调用者。原型模式已经和Java融为一体，大家可以随手哪来使用。
 *
 * 原型模式的注意事项：
 * 原型模式虽然简单，但是在Java中使用原型模式也就是clone方法还是有一些注意事项的，在demo中将会进行讲解。
 *
 *
 * 最佳实践：
 *
 * 原型模式先产生一个包含大量共有信息的类，然后可以拷贝出副本，修正细节信息，简历一个完整的个性对象。
 *
 */
public class ProtototypeClass implements Cloneable{

    //重写父类的Object方法

    @Override
    public ProtototypeClass clone(){

        ProtototypeClass protototypeClass = null;

        try {
            protototypeClass = (ProtototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return protototypeClass;
    }
}
