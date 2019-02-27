package com.ac.day20190227.date;

import java.util.Date;

/**
 * @program: java-basic
 * @description: 日期转换
 * @author: Mr.Ao
 * @create: 2019-02-27 16:47
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        long num = date.getTime();
        System.out.println(num);
        System.out.println(new Date(num));
    }
}
