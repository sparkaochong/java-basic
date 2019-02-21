package com.ac.day20190221.annotation;

/**
 * Created by Chong Ao on 2019/2/21.
 * 覆写注解
 */
class Person{
    @Override
    public String toString(){   //本意是要进行方法的覆写
        return "这是一个人。";
    }
}
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(new Person());
    }
}
