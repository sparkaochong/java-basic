package com.ac.day20190209;

/**
 * Created by Chong Ao on 2019/2/9.
 */
public class TestDemo2 {
    public static void main(String[] args) {
        new Person2().getName();
        System.out.println(new Person2("SMITH").getName());
    }
}

class Person2{
    private static int count = 1;//统计个数
    private String name;
    public Person2(){
        System.out.println("无名氏：" + count++);
    }

    public Person2(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
