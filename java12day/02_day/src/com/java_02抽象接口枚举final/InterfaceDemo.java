package com.java_02抽象接口枚举final;

public class InterfaceDemo {
    /**
     *类与类是继承关系 类与接口是实现关系
     *
     * 类实现接口格式
     * 修饰符 class 实现类名称 implements 接口1 ,接口2,....{
     *
     * }
     * implements 是实现接口的关键字
     */

    public static void main(String[] args) {
        Chaai ad=new Chaai("xiao");
        ad.run();
        ad.syria();
        ad.Go();

        XueSheng.GoGo();
    }
}

class Chaai implements XueSheng{
    public  String name;

    public Chaai(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+"运行一个方法");
    }

    @Override
    public void syria() {

        System.out.println("重写的方法");
    }
}

interface XueSheng{

    /**
     * 接口中抽象方法 public abstract 可以省略不写  默认加上
     * 接口中常量 public static final 可以省略不写 默认加上
     */
    void run();
    void syria();

    String AGE ="";
    public  static  final  String NAME ="小明";


    //jdk1.8之后  接口新增的默认方法  ：1 ，必须用default修饰 2，默认加上public 3，只能用接口的实现类来调用
    //当一个类继承一个父类 但是又实现多个接口 其中父类里一个方法和接口中一个默认方法重名的时候 子类会就近执行父类中的方法非接口中的方法
    //当多个接口中存在同名的方法时候 实现类必须重写这个方法
    default void Go(){
        //GoGoGo();
        System.out.println("默认方法");
    }
    //jdk1.8之后  接口新增的静态方法  ：1 ，可以用static修饰 2，默认加上public 3，只能用接口的本身的类名来调用
    // 如果实现多个接口 多个接口中存在同名的静态方法并不会冲突 原因是他们只能通过各自接口的名字来调用所以不会冲突
    static void GoGo(){
        System.out.println("静态方法");
    }
    //jdk1.9之后  接口新增的私有的实例方法  ： 用private修饰 只能在本类中访问 通常是给私有方法或者默认方法调用
    //private void GoGoGo(){
      // System.out.println("私有方法");
    //}
}
