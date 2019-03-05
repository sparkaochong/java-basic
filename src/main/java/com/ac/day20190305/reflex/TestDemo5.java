package com.ac.day20190305.reflex;

/**
 * @program: java-basic
 * @description: 传统工厂设计模式
 * @author: Mr.Ao
 * @create: 2019-03-05 15:20
 **/
interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    @Override
    public void eat() {
        System.out.println("*** 吃苹果！ ***");
    }
}
class Orange implements Fruit{
    @Override
    public void eat() {
        System.out.println("*** 吃橘子！ ***");
    }
}
class Factory{
    public static Fruit getInstance(String name){
        if("apple".equalsIgnoreCase(name)){
            return new Apple();
        }else if("orange".equalsIgnoreCase(name)){
            return new Orange();
        }
        return null;
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        Fruit f = Factory.getInstance("apple");
        f.eat();
    }
}
