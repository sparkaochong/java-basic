package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 假设此时的这个X子类只使用一次，那么有必要将其定义成一个单独的类吗？那么此时的设计不合理。
 */
interface A{
    public void printA();
}
class X implements A{
    @Override
    public void printA() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        A a = new X();
        a.printA();
    }
}
