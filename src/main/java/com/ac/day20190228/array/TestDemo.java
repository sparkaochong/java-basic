package com.ac.day20190228.array;

import java.util.Arrays;

/**
 * @program: java-basic
 * @description: 二分查找
 * @author: Mr.Ao
 * @create: 2019-02-28 20:18
 **/
public class TestDemo {
    public static void main(String[] args) {
        int[] data = new int[]{1,565,78343,86,79,93,45,23};
        Arrays.sort(data);
        System.out.println(Arrays.binarySearch(data,565));
    }
}
