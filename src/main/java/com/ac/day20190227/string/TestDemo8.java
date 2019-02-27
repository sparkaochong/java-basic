package com.ac.day20190227.string;

/**
 * @program: java-basic
 * @description: delete、deleteCharAt：删除指定范围内容、删除指定位置的字符
 * @author: Mr.Ao
 * @create: 2019-02-27 11:01
 **/
public class TestDemo8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World!!!");
//        sb.delete(5,15);
        sb.deleteCharAt(10);
        System.out.println(sb);
    }
}
