package com.ac.day20190211.overwriting;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A{
    void print(){
        System.out.println("**************** A *********************");
    }
}
class B extends A {
    public void print(){
        System.out.println("@@@@@@ A @@@@@@");
    }
}
public class TestJava {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
