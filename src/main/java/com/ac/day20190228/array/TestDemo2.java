package com.ac.day20190228.array;

import java.util.Arrays;

/**
 * @program: java-basic
 * @description: 数组的填充
 * @author: Mr.Ao
 * @create: 2019-02-28 20:46
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3};
        Arrays.fill(data,10);
        System.out.println(Arrays.toString(data));
    }
}
