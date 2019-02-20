package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * throws ¹Ø¼ü×Ö
 */
class MyMath{
    public static int div(int x,int y) throws Exception{
        return x/y;
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        try{
            System.out.println(MyMath.div(10,2));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
