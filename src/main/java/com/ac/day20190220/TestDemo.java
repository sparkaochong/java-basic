package com.ac.day20190220;

/**
 * Created by Chong Ao on 2019/2/20.
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(add(new int[]{10,20,50}));
    }

    /**
     * �˷�������ʵ���������������ݵ���Ӳ���
     * @param data  ������������Ҫ���װ������֮��
     * @return ���ݵ��ۼӽ��
     */
    public static int add(int[] data){
        int sum = 0;
        for (int x = 0;x<data.length;x++){
            sum += data[x];
        }
        return sum;
    }
}
