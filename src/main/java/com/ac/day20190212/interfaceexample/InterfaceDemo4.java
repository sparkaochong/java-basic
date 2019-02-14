package com.ac.day20190212.interfaceexample;

/**
 * Created by Chong Ao on 2019/2/12.
 */
interface A4{
    static interface B{
        void print();
    }
}
class X4 implements A4.B{
    @Override
    public void print() {
    }
}
public class InterfaceDemo4 {
    public static void main(String[] args) {

    }
}
