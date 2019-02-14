package com.ac.day20190211.polym;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A2{
    public void print(){
        System.out.println("Hello");
    }
}

class B2 extends A2{
    public void print(){
        System.out.println("ÄãºÃ");
    }
}

class C1 extends A2{
    public void print(){
        System.out.println("²»ºÃ");
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        fun(new A1());
        fun(new B1());
        fun(new C());
    }
    public static void fun(A1 a){
        a.print();
    }
}
