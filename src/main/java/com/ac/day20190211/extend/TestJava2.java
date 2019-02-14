package com.ac.day20190211.extend;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A2{
    public A2(){
        System.out.println("************");
    }
}
class B2 extends A2{
    public B2(){}
    public B2(String name){
        this();
        System.out.println("###############");
    }
}
public class TestJava2 {
    public static void main(String[] args) {
        B2 b2 = new B2("SMITH");
    }
}
