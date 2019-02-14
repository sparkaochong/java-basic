package com.ac.day20190130;

/**
 * Created by Chong Ao on 2019/1/30.
 */
public class ReferenceTest1 {
    public static void main(String[] args) {
        ReferenceDemo1 demo = new ReferenceDemo1(100);
        fun(demo);
        System.out.println(demo.getNum());
    }

    public static void fun(ReferenceDemo1 temp){
        temp.setNum(30);
    }
}
