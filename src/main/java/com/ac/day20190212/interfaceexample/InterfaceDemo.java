package com.ac.day20190212.interfaceexample;

/**
 * Created by Chong Ao on 2019/2/12.
 * 接口的使用
 */
interface A{
    String MSG = "Hello World!";
    void print();
}
interface B{
    public abstract void fun();
}
class X implements A,B{
    @Override
    public void print() {
        System.out.println("你好，嗨皮吗？");
    }

    @Override
    public void fun() {
        System.out.println(MSG);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        A a = new X();
        B b = (B) a;
        b.fun();
        /*X x = new X();
        A a = x;
        System.out.println(a instanceof A);
        B b = x;
        System.out.println(b instanceof B);
        a.print();
        ((X) a).fun();
        ((X) b).print();
        b.fun();
        x.print();
        x.fun();*/
    }
}
