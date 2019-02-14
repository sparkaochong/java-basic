package com.ac.day20190130;

/**
 * Created by Chong Ao on 2019/1/30.
 */
public class ReferenceTest2 {
    public static void main(String[] args) {
        int str = 10;
        fun(str);
        System.out.println(str);
    }

    public static void fun(int temp){
        temp = 30;
    }
}
