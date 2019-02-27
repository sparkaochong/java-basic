package com.ac.day20190227.runtime;

/**
 * @program: java-basic
 * @description: 产生垃圾
 * @author: Mr.Ao
 * @create: 2019-02-27 12:58
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("1.MAX = " + run.maxMemory());
        System.out.println("1.TOTAL = " + run.totalMemory());
        System.out.println("1.FREE = " + run.freeMemory());
        String str = "";
        for(int x=0;x<2000;x++){
            str += x;
        }
        System.out.println("2.MAX = " + run.maxMemory());
        System.out.println("2.TOTAL = " + run.totalMemory());
        System.out.println("2.FREE = " + run.freeMemory());
    }
}
