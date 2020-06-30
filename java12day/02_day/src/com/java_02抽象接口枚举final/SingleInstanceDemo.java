package com.java_02抽象接口枚举final;

public class SingleInstanceDemo {
    public static void main(String[] args) {

        SingleIntancel demo1=SingleIntancel.getInstance();
        demo1.demo111();

    }
}

class SingleIntancel extends FuLei{
    //2.定义一个静态成员变量用于存储一个对象（饿汉单例模式在返回对象时候，对象要已经做好）
    public static SingleIntancel iins=new SingleIntancel();
    //1.把类的构造器私有，让其只能在本类中访问
    private SingleIntancel(){

        System.out.println("子类构造器执行");

    }
    static {
        System.out.println("子类静态代码块执行");
    }
    {
        System.out.println("子类实例代码块执行");
    }
    //3.提供一个方法返回单例对象
    public static SingleIntancel getInstance(){
        System.out.println("子类返回对象");
        return iins;
    }

    public static final String SINET="qiange";

    public void demo111(){
        System.out.println("demo的方法");
    }
}

class FuLei{
    public FuLei(){
        System.out.println("父类构造器执行");
    }
    static {
        System.out.println("父类静态代码块执行");
    }
    {
        System.out.println("父类实例代码块执行");
    }
}