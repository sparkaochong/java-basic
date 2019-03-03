package com.ac.day20190303.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: java-basic
 * @description: Matcher类的使用
 * @author: Mr.Ao
 * @create: 2019-03-03 21:10
 **/
public class TestDemo9 {
    public static void main(String[] args) {
        String str = "150";
        String regex = "\\d+";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(str);
        System.out.println(mat.matches());
    }
}
