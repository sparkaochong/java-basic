package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
abstract class A5{//此类设计之初考虑到N年后的发展，需要有子类，但是N年前不需要
    public abstract void printA5();
    private static class B extends A5{
        @Override
        public void printA5() {
            System.out.println("Hello World!");
        }
    }
    public static A5 getInstance(){
        return new B();
    }
}
class C5 extends A5{
    @Override
    public void printA5() {
        System.out.println("************************");
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        A5 a = A5.getInstance();
        a.printA5();
        A5 a1 = new C5();   //留给用户做的
        a1.printA5();
    }
}
