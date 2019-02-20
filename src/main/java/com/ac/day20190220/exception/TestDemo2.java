package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * 单个异常处理
 */
public class TestDemo2 {
    public static void main(String[] args) {
        System.out.println("计算开始");
        try{
            int result = 10/2;
            System.out.println("除法计算 : " + result);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("********************************");
        }
        System.out.println("计算结束");
    }
}
