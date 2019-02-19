package com.ac.day20190219.singletonpattern;

/**
 * Created by aochong Cotter on 2019/2/19.
 * 懒汉式单例设计模式
 */
class Singleton1{
    public static Singleton1 instance = null;

    public Singleton1(){}
    public static Singleton1 getInstance(){
        instance = new Singleton1();
        return instance;
    }
    public void print(){
        System.out.println("singleton");
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Singleton1 inst = null;
        inst = Singleton1.getInstance();
        inst.print();
    }
}
