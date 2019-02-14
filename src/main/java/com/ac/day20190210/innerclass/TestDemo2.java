package com.ac.day20190210.innerclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo2 {
    public static void main(String[] args) {
        new Person1();
        new Person1();
    }
}

class Person1{
    private static String msg = "helloworld";
    private static String info;

    public Person1(){
        System.out.println("B 构造方法");
    }

    {
        System.out.println("A 构造块");
    }

    static {
        System.out.println("C 静态块");
        info = msg.substring(5, 10) + " nihao";
        info = info + 10;
        System.out.println(info);
    }
}
