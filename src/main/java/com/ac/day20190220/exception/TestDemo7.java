package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * 手工抛出异常
 */

public class TestDemo7 {
    public static void main(String[] args) {
        try{
            throw new Exception("手工抛出的异常");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
