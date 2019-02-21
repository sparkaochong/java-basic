package com.ac.day20190221.annotation;

/**
 * Created by Chong Ao on 2019/2/21.
 * ¹ýÆÚ×¢½â
 */
class Person1{
    @Deprecated
    public void fun(){
        System.out.println("Hello World!");
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Person1 per = new Person1();
        per.fun();
    }
}
