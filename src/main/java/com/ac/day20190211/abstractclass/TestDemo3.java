package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
abstract class A3{
    public abstract void printA3();
    static abstract class E{
        public abstract void printE();
    }
}
class B3 extends A3{
    @Override
    public void printA3() {

    }
    class F extends E{
        @Override
        public void printE() {

        }
    }
}
public class TestDemo3 {
    public static void main(String[] args) {

    }
}
