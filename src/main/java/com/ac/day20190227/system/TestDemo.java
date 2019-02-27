package com.ac.day20190227.system;

/**
 * @program: java-basic
 * @description: System类的使用
 * @author: Mr.Ao
 * @create: 2019-02-27 14:32
 **/
public class TestDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (end-start));
    }
}
