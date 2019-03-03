package com.ac.day20190303.regex;

/**
 * @program: java-basic
 * @description: 正则验证email地址
 * @author: Mr.Ao
 * @create: 2019-03-03 20:34
 **/
public class TestDemo7 {
    public static void main(String[] args) {
        String str = "spark-ao_chong11@gmail.hello.com";
        String regex = "[a-zA-Z][a-zA-Z0-9_\\-\\.]{5,29}@[a-zA-Z0-9_\\-\\.]+\\.(com|net|cn|com\\.cn|edu|top|org|xyz|net\\.cn|gov|me|e)";
        System.out.println(str.matches(regex));
    }
}
