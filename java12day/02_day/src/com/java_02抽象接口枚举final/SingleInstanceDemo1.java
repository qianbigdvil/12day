package com.java_02抽象接口枚举final;

public class SingleInstanceDemo1 {
}
class SingleInstanceDemo11{
    //2.定义一个静态成员变量用于存储一个对象（懒汉单例模式 不直接创建对象 在需要使用时候才创建）
    public static SingleInstanceDemo11 ins;
   //1.构造器私有
    private SingleInstanceDemo11(){

    }
    //3.通过方法返回一个对象，第一次不存在对象才创建一个返回
    public static SingleInstanceDemo11 getInstance(){

        if (ins == null){
             //第一次来取对象，创建一个对象
            ins =new SingleInstanceDemo11();
        }
        return ins;
    }

}