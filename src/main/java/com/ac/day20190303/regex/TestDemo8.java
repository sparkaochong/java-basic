package com.ac.day20190303.regex;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @program: java-basic
 * @description: Pattern类的使用
 * @author: Mr.Ao
 * @create: 2019-03-03 21:10
 **/
public class TestDemo8 {
    public static void main(String[] args) {
        String str = "fgjsh4643@@f89^&^fdh45646";
        String regex = "[^a-zA-Z]+";
        Pattern pat = Pattern.compile(regex);
        System.out.println(Arrays.toString(pat.split(str)));
    }
}
