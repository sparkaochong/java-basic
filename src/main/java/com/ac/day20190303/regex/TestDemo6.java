package com.ac.day20190303.regex;

/**
 * @program: java-basic
 * @description: 匹配电话号码
 * @author: Mr.Ao
 * @create: 2019-03-03 17:39
 **/
public class TestDemo6 {
    public static void main(String[] args) {
        String str = "(010-62350411";
        String regex = "(\\d{3,4}-?)|(\\(\\d{3,4}\\)-?)\\d{7,8}";
        System.out.println(str.matches(regex));
    }
}
