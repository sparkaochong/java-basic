package com.ac.day20190211.polym;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A3{
    public void print(){
        System.out.println("Hello");
    }
}
class B3 extends A3{
    public void print(){
        System.out.println("���");
    }

    public void funB(){
        System.out.println("@@@@@@@@@@@@@@ B @@@@@@@@@@@@@@");
    }
}

class C3 extends A3{
    public void print(){
        System.out.println("����");
    }

    public void funC(){
        System.out.println("@@@@@@@@@@@@@@ C @@@@@@@@@@@@@@");
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        fun(new B3());
        fun(new C3());
    }

    public static void fun(A3 a){
        a.print();
        //����ĳ���������󣬱������B���е�funB()����������Ҫ��������ת��
        B3 b = (B3) a;
        b.funB();
    }
}
