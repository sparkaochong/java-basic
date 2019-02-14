package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
abstract class A4{
    public abstract void printA3();
    static abstract class E{
        public abstract void printE();
    }
}
class B4 extends A4.E{
    @Override
    public void printE() {

    }
}
public class TestDemo4 {
}
