package com.ac.day20190227.date;

import java.util.Calendar;

/**
 * @program: java-basic
 * @description: Calendar类的使用
 * @author: Mr.Ao
 * @create: 2019-02-27 18:43
 **/
public class TestDemo4 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append(cal.get(Calendar.YEAR)).append("年");
        sb.append(cal.get(Calendar.MONTH)+1).append("月");
        sb.append(cal.get(Calendar.DAY_OF_MONTH)).append("日");
        sb.append(cal.get(Calendar.HOUR_OF_DAY)).append("时");
        sb.append(cal.get(Calendar.MINUTE)).append("分");
        sb.append(cal.get(Calendar.SECOND)).append("秒");
        sb.append(cal.get(Calendar.MILLISECOND));
        System.out.println(sb);
    }
}
