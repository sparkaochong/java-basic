package com.ac.day20190227.string;

/**
 * @program: java-basic
 * @description: StringBuffer
 * @author: Mr.Ao
 * @create: 2019-02-27 11:01
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        String str = "Hello " + "World " + "!!!";
        CharSequence cs = str;
        System.out.println(cs.subSequence(5,8));
    }
}
