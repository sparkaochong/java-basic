package com.ac.day20190211.arrayoper;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class ArrayTest {
    public static void main(String[] args) {
        ReverseArray arr = new ReverseArray(5);   //��ʼ��5��Ԫ��
        System.out.println(arr.add(90));
        System.out.println(arr.add(50));
        System.out.println(arr.add(89));
        System.out.println(arr.add(34));
        System.out.println(arr.add(56));
        arr.Inc(3); //��������
        System.out.println(arr.add(56));
        int temp[] = arr.getData();
        for(int x = 0; x < temp.length; x++){
            System.out.print(temp[x] + "��");
        }
    }
}
