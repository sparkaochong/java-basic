package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 基本数据类型转换为String类型
 */
public class WrapperClass9 {
    public static void main(String[] args) {
//       String str = "" + 100;   //""最终会成为垃圾
        String str = String.valueOf(100);   //避免产生垃圾
        System.out.println(str.length());//3
    }
}
