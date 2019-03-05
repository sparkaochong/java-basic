package com.ac.day20190305.reflex;

import java.util.Date;

/**
 * @program: java-basic
 * @description: 利用类.class取得Class对象
 * @author: Mr.Ao
 * @create: 2019-03-05 14:51
 **/
class Person{
    public Person(){
        System.out.println("**** 新的Person类对象 ****");
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.ac.day20190305.reflex.Person");
            Person per = (Person) cls.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
