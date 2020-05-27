package com.java._01封装继承多态;

/**
 * 知识回顾
 * 面向对象：
 *     用代码去高度的模拟世界 以便为人类服务
 *     java是一种java的高级面向对象语言
 *     面向对象两个重要的概念 ：类 和 对象
 *     类 ： 具有相同事物的共同特征的抽象
 *     对象 ： 具体存在的实例
 *     类的格式 ：
 *     修饰符 class 类名 {}  类名首字母 要大写
 *     一个代码文件中可以定义多个类 但是只能有一个类是用public修饰的  并且用public修饰的类名 必须是文件名
 *     类中有且只有五大成分
 *       成员变量 （field  用于描述类和对象的属性信息）
 *       成员方法 （ Method 用于描述类和对象的属性方法）
 *       构造器  （ constructor 初始化一个类的对象并且返回引用）
 *       代码块
 *       内部类
 *
 *       this关键字的引用
 *           this代表当前对象的引用
 *           this关键字可以用在实例方法和构造器中
 *           this用在方法中，谁调用这个方法，this就代表谁
 *           this用在构造器中，代表了构造器正在初始化的对象的引用
 *
 */
public class Demo_01 {
public static void main(String[] args){
    System.out.println(0b11111111);//二进制表示方法
    System.out.println(0100);
    System.out.println(0x490);
    QanDa qanDa=new QanDa();
    qanDa.setName("名字");
    System.out.println(qanDa);
}

}

class QanDa {
    private String name;
    private int age;
    private  char sex;


    public QanDa(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public QanDa() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;   //  qanDa.name=名字
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "QanDa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}