package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * �쳣����ģ��
 */
class MyMath2{
    public static int div(int x,int y)throws Exception{
        int result = 0;
        System.out.println("�������㿪ʼ");
        try{
            result = x/y;
        }catch(Exception e){
            throw e;
        }finally {
            System.out.println("�����������");
        }
        return result;
    }
}
public class TestDemo8 {
    public static void main(String[] args) {
        try{
            System.out.println(MyMath2.div(10,0));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
