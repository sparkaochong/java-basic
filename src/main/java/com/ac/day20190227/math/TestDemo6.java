package com.ac.day20190227.math;

import java.math.BigDecimal;

/**
 * @program: java-basic
 * @description: BigDecimal实现四舍五入工具类
 * @author: Mr.Ao
 * @create: 2019-02-28 09:36
 **/
class MyMath1 {
    public static double round(double num,int scale){
        return new BigDecimal(num).divide(new BigDecimal(1),scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
public class TestDemo6 {
    public static void main(String[] args) {
        System.out.println(MyMath1.round(-15.5579465,2));
        System.out.println(MyMath1.round(-15.50,0));
        System.out.println(MyMath1.round(-15.55,0));
    }
}
