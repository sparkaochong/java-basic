package com.ac.day20190212.interfaceexample;

/**
 * Created by Chong Ao on 2019/2/12.
 * ×ÓÀà¶à¼Ì³Ð
 */
interface A1{
    String MSG = "Hello World!";
    public void print();
}
interface B1{
    void fun();
}
abstract class C1{
    abstract void print();
}
class X1 extends C1 implements A1,B1{
    @Override
    public void print() {

    }

    @Override
    public void fun() {

    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
    }
}
