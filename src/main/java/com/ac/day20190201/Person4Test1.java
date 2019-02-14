package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/9.
 */
public class Person4Test1 {
    public static void main(String[] args) {
        System.out.println(Person4.country);
        Person4.country = "北宋";
        System.out.println(Person4.country);
        System.out.println(new Person4("张三", 20).getInfo());
    }
}
