package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class ComparingObjectDemo1 {
    public static void main(String[] args) {
        Person1 perA = new Person1("李四", 30);
        Person1 perB = new Person1("李四", 30);
        if(perA.compare(null)){
            System.out.println("是同一个人！");
        }else{
            System.out.println("不是同一个人！");
        }
    }
}
