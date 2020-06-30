package com.java_03多态内部类data;

/*
  多态概念：
   同一类型的对象 在执行同一行为，在不同状态下会表现出不同的行为特征




 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        //父类类型 对象名称 = new 子类构造器  （多态）
        Animal dlam=new Cat("猫科");
        dlam.run();

        Animal taidi=new Dog("犬科");
        taidi.run();

    }
}

class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println( name+"的运动");
    }
}

class Cat extends Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println( name+"的运动");
    }
}

class  Animal{
    public void run(){
        System.out.println("运动");
    }
}