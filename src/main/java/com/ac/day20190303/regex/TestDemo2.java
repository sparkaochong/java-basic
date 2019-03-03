package com.ac.day20190303.regex;

/**
 * @program: java-basic
 * @description: 全替换非字母
 * @author: Mr.Ao
 * @create: 2019-03-03 17:09
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        String str = "fghj4653265@#$$$___";
        String regex = "[^a-zA-Z]";
        System.out.println(str.replaceAll(regex,""));
    }
}
