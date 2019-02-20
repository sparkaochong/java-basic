package com.ac.day20190220;

/**
 * Created by Chong Ao on 2019/2/20.
 */
public class TestDemo3 {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5,6};
        for (int x: data
             ) {    //数组里面的每一个内容通过循环取出，取出的内容交给x
            System.out.println(x);  //不需要操作索引
        }
    }
}
