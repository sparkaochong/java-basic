package com.ac.day20190227.math;

import java.math.BigDecimal;

/**
 * @program: java-basic
 * @description: BigDecimal类的使用
 * @author: Mr.Ao
 * @create: 2019-02-28 09:10
 **/
public class TestDemo5 {
    public static void main(String[] args) {
        System.out.println(Double.MAX_VALUE * Double.MAX_VALUE);
        //Infinity
        BigDecimal bigA = new BigDecimal(Double.MAX_VALUE);
        BigDecimal bigB = new BigDecimal(Double.MAX_VALUE);
        System.out.println(bigA.pow(1000));
        System.out.println(bigA.multiply(bigB));
    }
}
