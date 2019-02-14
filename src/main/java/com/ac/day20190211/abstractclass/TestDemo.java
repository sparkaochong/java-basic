package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
abstract class A{
    public static final String INFO = "Hello World!";
    public A(){
        this.fun();
    }
    public void fun(){
        System.out.println("Hello World!");
    }
    public abstract void print();
}
class B extends A{
    private int num = 50;
    public B(int num){
        this.num = num;
    }
    @Override
    public void print() {
        System.out.println("这个方法是强制子类要覆写的方法");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        A a = new B(100);
        a.print();
    }
}
