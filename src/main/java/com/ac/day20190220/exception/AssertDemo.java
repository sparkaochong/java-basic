package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * ����
 */

public class AssertDemo {
    public static void main(String[] args) {
        int num = 10;
        //�����м侭������������
        assert num == 100 : "���Դ���num�����ݲ���100";
        System.out.println(num);
    }
}
