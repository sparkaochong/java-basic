package com.ac.day20190211.polym;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A{
    public void print(){
        System.out.println("Hello");
    }
}
class B extends A{
    public void print(){
        System.out.println("���");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        A a = new B();  //����ת��
        B b = (B) a;    //����ת��
        a.print();
        b.print();
    }
}
