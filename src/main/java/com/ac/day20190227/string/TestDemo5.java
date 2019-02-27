package com.ac.day20190227.string;

/**
 * @program: java-basic
 * @description: StringBuffer转String
 * @author: Mr.Ao
 * @create: 2019-02-27 11:01
 **/
public class TestDemo5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("World ").append("!!!");
        String str = "" + sb;
        System.out.println(str);
    }
}
