package com.java._01封装继承多态;

import sun.awt.geom.AreaOp;

/**
 * 封装，继承，多态
 *  封装作用：
 *   1、提高安全性 2、实现代码组件话
 *  封装规范：
 *   1、建议成员变量私有化 ： 用 private
 *   private修饰的方法，成员变量，构造器等只能在本类被直接访问
 *   2、提供成套的setter和getter方法暴露成员变量的取值和赋值
 *
 *
 *   static 修饰的方法和变量可以直接用类名访问 属于静态方法和静态变量
 *   会在类加载时候加载 加载在方法区里的静态区 不在堆内存中
 *   没有static修饰的方法和变量是实例方法和实例变量 不能直接用类名访问 必须new一个对象才可以 用对象名访问
 *
 */
public class PackageDemo02 {

    public  static String qianname = "千歌";

    private String name="25";
    private  int age=155;

    public static void main(String[] args) {


        System.out.println(PackageDemo02.qianname);
        String a=qianname;

        PackageDemo02 packageDemo02=new PackageDemo02();


        System.out.println(packageDemo02.name);
        System.out.println(packageDemo02.age);
        System.out.println(packageDemo02.qianname);
    }

}

class PackageDemo03 {



}