package com.ac.day20190221.annotation;

/**
 * Created by Chong Ao on 2019/2/21.
 */
class Person2<T>{
    @Deprecated
    public void fun(){}
}
public class TestDemo2 {
    @SuppressWarnings({"deprecation","null"})
    public static void main(String[] args) {
        Person2 per = null;
        per.fun();
    }
}
