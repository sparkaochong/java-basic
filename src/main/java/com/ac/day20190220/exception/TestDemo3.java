package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * 多个异常处理
 */
public class TestDemo3 {
    public static void main(String[] args) {
        System.out.println("计算开始");
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int result = x/y;
            System.out.println("除法计算 : " + result);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally{
            System.out.println("********************************");
        }
        System.out.println("计算结束");
    }
}
