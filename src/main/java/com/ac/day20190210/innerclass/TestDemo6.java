package com.ac.day20190210.innerclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
class Outer2{
    private static String info = "hello world";
     static class Inner2{//相当于就是外部类
        public void print(){
            System.out.println(info);
        }
    }
}

public class TestDemo6 {
    public static void main(String[] args) {
        Outer2.Inner2 oi = new Outer2.Inner2();
        oi.print();
    }
}
