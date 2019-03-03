package com.ac.day20190303.regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @program: java-basic
 * @description: 匹配日期
 * @author: Mr.Ao
 * @create: 2019-03-03 17:30
 **/
public class TestDemo5 {
    public static void main(String[] args) {
        String str = "2019-03-03";
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        if(str.matches(regex)){
            try {
                System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(str));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("匹配出错！");
        }
    }
}
