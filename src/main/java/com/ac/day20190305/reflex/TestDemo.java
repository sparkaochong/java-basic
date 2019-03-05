package com.ac.day20190305.reflex;

import java.util.Date;

/**
 * @program: java-basic
 * @description: 利用Object类.getClass()方法取得Class对象
 * @author: Mr.Ao
 * @create: 2019-03-05 14:37
 **/
public class TestDemo {
    public static void main(String[] args) {
        Date date = new Date();
        Class<?> cls = date.getClass();
        System.out.println("全名" + cls.getName());
        System.out.println("类名" + cls.getSimpleName());
    }
}
