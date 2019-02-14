package com.ac.day20190212.interfaceexample;

/**
 * Created by Chong Ao on 2019/2/12.
 * 抽象类直接实现接口
 */
interface A2{
    String MSG = "Hello World!";
    public void print();
}

abstract class B2 implements A2{
    public abstract void fun();
}

class X2 extends B2{
    @Override
    public void print() {

    }

    @Override
    public void fun() {
        
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
    }
}
