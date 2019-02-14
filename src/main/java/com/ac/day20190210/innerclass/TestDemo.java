package com.ac.day20190210.innerclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo {
    public static void main(String[] args) {
       {
            int x = 10; //局部变量
            System.out.println("x = " + x);
        }
        int x = 100;    //全局变量
        System.out.println("x = " + x);
    }
}
