package com.ac.day20190227.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: java-basic
 * @description: 将日期格式化为字符串
 * @author: Mr.Ao
 * @create: 2019-02-27 18:26
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String str = sdf.format(date);
        System.out.println(str);
    }
}
