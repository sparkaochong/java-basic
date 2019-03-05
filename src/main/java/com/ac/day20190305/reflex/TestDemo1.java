package com.ac.day20190305.reflex;

import java.util.Date;

/**
 * @program: java-basic
 * @description: 利用类.class取得Class对象
 * @author: Mr.Ao
 * @create: 2019-03-05 14:51
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Class<?> cls = Date.class;
        System.out.println("全名" + cls.getName());
        System.out.println("类名" + cls.getSimpleName());
    }
}
