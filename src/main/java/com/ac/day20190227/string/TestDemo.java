package com.ac.day20190227.string;

/**
 * @program: java-basic
 * @description: StringBuffer
 * @author: Mr.Ao
 * @create: 2019-02-27 11:01
 **/
public class TestDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello ").append("World!");
//        System.out.println(sb);
        fun(sb);
        System.out.println(sb);
    }

    public static void fun(StringBuffer sb){
        sb.append("\n ¿ΩÁ£¨ƒ„∫√£°");
    }
}
