package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * JDK1.5之后自动装箱与拆箱
 */
public class WrapperClass2 {
    public static void main(String[] args) {
        Integer x = 100;    //装箱操作
        System.out.println(++ x * 10);    //自动拆箱进行数学运算，1010
    }
}
