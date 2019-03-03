package com.ac.day20190303.regex;

/**
 * @program: java-basic
 * @description: 正则表达式判断字符串是否由数字所组成
 * @author: Mr.Ao
 * @create: 2019-03-03 16:15
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        String str = "12387aa6465";
        System.out.println(str.matches("\\d+"));
    }
}
