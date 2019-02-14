package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Person4Test {
    public static void main(String[] args) {
        Person4 perA = new Person4("张三", 30);
        Person4 perB = new Person4("李四", 20);
        Person4 perC = new Person4("王二", 10);
        Person4.country = "中国唐朝";
        System.out.println(perA.getInfo());
        System.out.println(perB.getInfo());
        System.out.println(perC.getInfo());
    }
}
