package com.java._01封装继承多态;

/**
 * 方法重写
 * 子类如果觉得父类中的一个方法不好用或者无法满足需求 子类可以重写与父类声明一样的方法来覆盖父类的方法
 *
 * 方法重写的校验：@Override
 * java建议在重写的方法上加上一个注解@Override
 *一旦加上这个注解 那么必须是成功的重写父类的方法 否则会报错
 * @Override 优势：可读性好 安全 优雅
 *
 *
 * 方法重写的具体要求
 * 1，子类重写方法的名称和形参列表必须与父类被重写方法一样
 * 2，子类重写方法的返回值类型声明要么与父类一样 要么比父类返回值类型范围更小
 * 3，子类重写方法的修饰符权限应该与父类被重写方法一样或者更大
 * 4，子类重写方法声明抛出的异常应该与父类被重写方法声明抛出的异常一样或者范围更小
 */
public class ExtendsDemo03 {

    public static void main(String[] args) {
        Animal animal=new Animal("千歌",15,'男');
        animal.Chi();
    }

}
class Cat {

    private String name;
    private  int age;
    private  char ai;

    public Cat() {

    }

    public Cat(String name, int age, char ai) {
        this.name = name;
        this.age = age;
        this.ai = ai;
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

    public char getAi() {
        return ai;
    }

    public void setAi(char ai) {
        this.ai = ai;
    }



    public void Chi(){

    }

}

class Animal extends Cat{

    public Animal(String name, int age, char ai) {
        super(name, age, ai);
    }

    @Override
    public void Chi() {
        super.Chi(); //super 调用父类的方法
        System.out.println(  "Cat{" +
                "name='" + getName()+ '\'' +
                ", age=" +getAge() +
                ", ai=" + getAi() +
                '}');
    }
}