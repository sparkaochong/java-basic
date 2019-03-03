package com.ac.day20190303.regex;

/**
 * @program: java-basic
 * @description: 正则结构验证
 * @author: Mr.Ao
 * @create: 2019-03-03 17:21
 **/
public class TestDemo4 {
    public static void main(String[] args) {
        String str = "15.";
        String regex = "\\d+(\\.\\d+)?";
        if(str.matches(regex)){
            System.out.println(Double.parseDouble(str));
        }else{
            System.out.println("匹配出错!");

        }
    }
}
