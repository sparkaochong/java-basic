package com.ac.day20190212.interfaceexample;

/**
 * Created by Chong Ao on 2019/2/12.
 * ½Ó¿Ú¶à¼Ì³Ð
 */
interface A3{
    void printA3();
}
interface B3{
    void printB3();
}
interface C3 extends A3,B3{
    void printC3();
}
class X3 implements C3{
    @Override
    public void printA3() {

    }

    @Override
    public void printB3() {

    }

    @Override
    public void printC3() {

    }
}
public class InterfaceDemo3 {
    public static void main(String[] args) {
    }
}
