package com.ac.day20190311.file;

/**
 * @program: java-basic
 * @description: 列出本机全部属性信息
 * @author: Mr.Ao
 * @create: 2019-03-13 14:35
 **/
public class TestDemo11 {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
    }
}
