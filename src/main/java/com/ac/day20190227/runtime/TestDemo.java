package com.ac.day20190227.runtime;

/**
 * @program: java-basic
 * @description: Runtime取得内存大小
 * @author: Mr.Ao
 * @create: 2019-02-27 12:58
 **/
public class TestDemo {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("1.MAX = " + run.maxMemory());
        System.out.println("1.TOTAL = " + run.totalMemory());
        System.out.println("1.FREE = " + run.freeMemory());
    }
}
