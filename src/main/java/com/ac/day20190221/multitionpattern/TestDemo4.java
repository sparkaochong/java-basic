package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * ֤��enum����ķ����Ǽ̳���java.lang.Enum
 */
enum Color4{
    RED,BLUE,GREEN;
}
public class TestDemo4 {
    public static void main(String[] args) {
        for(Color3 c:Color3.values()){
            System.out.println(c.name() + " -----> " + c.ordinal());
        }
    }
}
