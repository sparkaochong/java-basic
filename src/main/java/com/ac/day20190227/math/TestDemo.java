package com.ac.day20190227.math;

/**
 * @program: java-basic
 * @description: 四舍五入操作
 * @author: Mr.Ao
 * @create: 2019-02-27 19:01
 **/
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(Math.round(100.798));
        System.out.println(Math.round(15.50));
        System.out.println(Math.round(15.51));
        //如果是负数，小数位超过0.5就会进行进位
        System.out.println(Math.round(-15.50));
        System.out.println(Math.round(-15.51));
    }
}
