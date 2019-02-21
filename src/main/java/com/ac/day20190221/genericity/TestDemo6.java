package com.ac.day20190221.genericity;

/**
 * Created by Chong Ao on 2019/2/21.
 * ·ºÐÍ·½·¨
 */
public class TestDemo6 {
    public static void main(String[] args) {
        Integer num[] = fun(1,2,3);
        for(int x: num){
            System.out.println(x);
        }
    }
    public static <T> T[] fun(T ... arg){
        return arg;
    }
}
