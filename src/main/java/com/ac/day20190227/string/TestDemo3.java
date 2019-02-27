package com.ac.day20190227.string;

/**
 * @program: java-basic
 * @description: String转StringBuffer
 * @author: Mr.Ao
 * @create: 2019-02-27 11:01
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        String str = "Hello " + "World " + "!!!";
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb);
    }
}
