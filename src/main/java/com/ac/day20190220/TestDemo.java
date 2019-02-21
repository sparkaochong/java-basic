package com.ac.day20190220;

/**
 * Created by Chong Ao on 2019/2/20.
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(add(new int[]{10,20,50}));
    }

    /**
     * 此方法可以实现任意多个整型数据的相加操作
     * @param data  所有整型数据要求封装在数组之中
     * @return 数据的累加结果
     */
    public static int add(int[] data){
        int sum = 0;
        for (int x = 0;x<data.length;x++){
            sum += data[x];
        }
        return sum;
    }
}
