package com.ac.day20190219.singletonpattern;

/**
 * Created by aochong Cotter on 2019/2/19.
 * 饿汉式单例设计模式
 */
class Singleton{
    public static final Singleton INSTANCE = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return INSTANCE;
    }
    public void print(){
        System.out.println("singleton");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Singleton inst = null;
        inst = Singleton.getInstance();
        inst.print();
    }
}
