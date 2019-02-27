package com.ac.day20190227.math;

/**
 * @program: java-basic
 * @description: 四舍五入操作
 * @author: Mr.Ao
 * @create: 2019-02-27 19:01
 **/
class MyMath{
    /**
     * 实现数字的四舍五入操作
     * @param num   要进行四舍五入的数字
     * @param scale 保留的小数位数
     * @return  保留指定小数位后的四舍五入数据
     */
    public static double round(double num,int scale){
        return Math.round(num * Math.pow(10.0,scale)) / Math.pow(10.0,scale);
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        System.out.println(MyMath.round(10.978,2));
    }
}
