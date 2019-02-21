package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * Ã¶¾ÙµÄ±éÀú
 */
enum Color3{
    RED,GREEN,BLUE;
}
public class TestDemo3 {
    public static void main(String[] args) {
        for(Color3 c:Color3.values()){
            System.out.println(c);
        }
    }
}
