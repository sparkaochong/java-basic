package com.ac.day20190227.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: java-basic
 * @description: 将字符串格式化为日期时间
 * @author: Mr.Ao
 * @create: 2019-02-27 18:30
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        String str = "1994-11-15 22:35:30.322";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        try {
            Date date = sdf.parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
