package com.ac.day20190228.array;

import java.util.Arrays;

/**
 * @program: java-basic
 * @description: 数组比较
 * @author: Mr.Ao
 * @create: 2019-02-28 20:39
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        int[] data1 = new int[]{1,2,3};
        Arrays.sort(data1);
        int[] data2 = new int[]{2,1,3};
        Arrays.sort(data2);
        System.out.println(Arrays.equals(data1,data2));
    }
}
