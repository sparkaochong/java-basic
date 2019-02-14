package com.ac.day20190211.overwriting;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A1 {
    public void fun() {
        this.print();
    }

    private void print() {
        System.out.println("**************** A *********************");
    }
}

class B1 extends A1 {
    public void print() {
        System.out.println("@@@@@@ A @@@@@@");
    }
}

public class TestJava1 {
    public static void main(String[] args) {
        B1 b = new B1();
        b.fun();
    }
}
