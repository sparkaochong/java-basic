package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * �����쳣����
 */
public class TestDemo2 {
    public static void main(String[] args) {
        System.out.println("���㿪ʼ");
        try{
            int result = 10/2;
            System.out.println("�������� : " + result);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("********************************");
        }
        System.out.println("�������");
    }
}
