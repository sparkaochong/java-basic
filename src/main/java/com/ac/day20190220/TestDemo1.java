package com.ac.day20190220;

/**
 * Created by Chong Ao on 2019/2/20.
 * ʹ�ÿɱ����
 */
public class TestDemo1 {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(1,2,3));
        System.out.println(add(4,5,6,7));
        System.out.println(add(new int[]{1,2,3}));  //��������
    }

    /**
     * �˷�������ʵ���������������ݵ���Ӳ���
     * @param data  ������������Ҫ���װ������֮��
     * @return ���ݵ��ۼӽ��
     */
    public static int add(int ... data){    //�ɱ���������������������ʽ
        int sum = 0;
        for (int x = 0;x<data.length;x++){
            sum += data[x];
        }
        return sum;
    }
}
