package com.ac.day20190305.international;

import java.util.Locale;

/**
 * @program: java-basic
 * @description: Locale类的使用
 * @author: Mr.Ao
 * @create: 2019-03-05 18:32
 **/
public class TestDemo {
    public static void main(String[] args) {
        Locale  locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(Locale.CHINA);
        System.out.println(Locale.US);
    }
}
