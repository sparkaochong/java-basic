package com.ac.day20190130;

/**
 * Created by Chong Ao on 2019/1/30.
 */
public class ReferenceTest3 {
    public static void main(String[] args) {
        ReferenceDemo3 demo3 = new ReferenceDemo3("world");
        fun(demo3);
        System.out.println(demo3.getMsg());
    }

    public static void fun(ReferenceDemo3 temp){
        temp.setMsg("test");
    }
}
