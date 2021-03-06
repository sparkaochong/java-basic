package com.ac.day20190311.file;

import java.util.Scanner;

/**
 * @program: java-basic
 * @description: Scanner类的使用
 * @author: Mr.Ao
 * @create: 2019-03-13 19:19
 **/
public class TestDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("请输入年龄：");
        if (sc.hasNextInt()) {
            System.out.println("输入内容为：" + sc.nextInt());
        } else {
            System.out.println("输入的年龄有误！！！");
        }
        sc.close();
    }
}
