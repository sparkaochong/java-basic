package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * ������ʹ��throws�ؼ���
 */
class MyMath1{
    public static int div(int x,int y) throws Exception{
        return x/y;
    }
}
public class TestDemo6 {
    public static void main(String[] args) throws Exception{
        System.out.println(MyMath1.div(10,0));
    }
}
