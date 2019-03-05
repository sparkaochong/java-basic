package com.ac.day20190305.reflex;

import java.util.Date;

/**
 * @program: java-basic
 * @description: 利用类.class取得Class对象
 * @author: Mr.Ao
 * @create: 2019-03-05 14:51
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.util.Date");
            Date date = (Date) cls.newInstance();
            System.out.println(date);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
