package com.ac.day20190311.file;

import java.util.Scanner;

/**
 * @program: java-basic
 * @description: Scanner类的使用
 * @author: Mr.Ao
 * @create: 2019-03-13 19:19
 **/
public class TestDemo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("请输入生日：");
        if (sc.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("输入生日为：" + sc.next("\\d{4}-\\d{2}-\\d{2}"));
        } else {
            System.out.println("输入的生日有误！！！");
        }
        sc.close();
    }
}
