package com.ac.day20190214.objectclass;

/**
 * Created by aochong Cotter on 2019/2/14.
 * ¸¨Öú¸ÅÄî
 */
interface A{
    public void printA();
}
interface B{
    public void printB();
}
class X implements A,B{
    @Override
    public void printA() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Override
    public void printB() {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBB");
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        A a = new X();
        B b = (B) a;
        b.printB();
        /*A a = x;
        B b = x;
        a.printA();
        b.printB();*/
    }
}
