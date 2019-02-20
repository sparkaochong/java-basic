package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * 异常处理模型
 */
class MyMath2{
    public static int div(int x,int y)throws Exception{
        int result = 0;
        System.out.println("除法计算开始");
        try{
            result = x/y;
        }catch(Exception e){
            throw e;
        }finally {
            System.out.println("除法计算结束");
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
