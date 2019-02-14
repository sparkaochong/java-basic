package com.ac.day20190211.polym;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A1{
    public void print(){
        System.out.println("Hello");
    }
}

class B1 extends A1{
    public void print(){
        System.out.println("ÄãºÃ");
    }
}
class C extends A1{
    public void print(){
        System.out.println("²»ºÃ");
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        fun(new A1());
        fun(new B1());
        fun(new C());
    }
    public static void fun(A1 a){
        a.print();
    }

    public static void fun(B1 b){
        b.print();
    }

    public static void fun(C c){
        c.print();
    }
}
