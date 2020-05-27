package com.java_02抽象接口枚举final;

public class AbstractDemo {

    /**
     * 抽象类
     *
     * @param args
     */

    public static void main(String[] args) {

    }


}
abstract  class add{

     private static   String name;
     private  int age;

    public add(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void Cat();
}

class  cas extends add{

    public cas(String name) {
        super(name);
    }

    @Override
    public void  Cat() {
        System.out.println("chonxie");
    }
}