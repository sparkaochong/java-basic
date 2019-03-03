package com.ac.day20190303.regex;

import java.util.Arrays;

/**
 * @program: java-basic
 * @description: 字母拆分
 * @author: Mr.Ao
 * @create: 2019-03-03 17:12
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        String str = "fs4564wsdf7434@fhkj.fsa";
        String regex = "[a-zA-Z]+";
        System.out.println(Arrays.toString(str.split(regex)));
    }
}
