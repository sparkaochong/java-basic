package com.ac.day20190227.string;

/**
 * @program: java-basic
 * @description: insert：在指定位置插入数据
 * @author: Mr.Ao
 * @create: 2019-02-27 11:01
 **/
public class TestDemo7 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("World ").append("!!!");
        sb.reverse();
        System.out.println(sb);
    }
}
