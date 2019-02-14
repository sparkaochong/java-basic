package com.ac.day20190211.overwriting;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A2 {
    String info = "Hello World!";
}

class B2 extends A2 {
    int info = 100;
    public void print() {
        System.out.println(this.info);
        System.out.println(super.info);
    }
}

public class TestJava2 {
    public static void main(String[] args) {
        B2 b = new B2();
        b.print();
    }
}
