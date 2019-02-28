package com.ac.day20190227.math;

import java.math.BigInteger;

/**
 * @program: java-basic
 * @description: BigInteger四则运算
 * @author: Mr.Ao
 * @create: 2019-02-28 09:10
 **/
public class TestDemo4 {
    public static void main(String[] args) {
        BigInteger bigA = new BigInteger("46576846465466435866844644646546479465446846564");
        BigInteger bigB = new BigInteger("47946544684656412314658799954445");
        System.out.println("加法操作：" + bigA.add(bigB));
        System.out.println("减法操作：" + bigA.subtract(bigB));
        System.out.println("乘法操作：" + bigA.multiply(bigB));
        System.out.println("除法操作：" + bigA.divide(bigB));
        //有余数的除法操作
        BigInteger result[] = bigA.divideAndRemainder(bigB);
        System.out.println("商：" + result[0] + " 余数：" + result[1]);
    }
}
