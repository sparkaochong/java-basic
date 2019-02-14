package com.ac.day20190211.polym;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A4{
    public void print(){
        System.out.println("Hello");
    }
}

class B4 extends A4{
    public void print(){
        System.out.println("ÄãºÃ");
    }

    public void funB(){
        System.out.println("@@@@@@@@@@@@@@ B @@@@@@@@@@@@@@");
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        A4 a = new B4();
        System.out.println(a instanceof A4);
        System.out.println(a instanceof B4);
        if(a instanceof B4){
            B4 b = (B4) a;
            b.print();
        }
    }
}
