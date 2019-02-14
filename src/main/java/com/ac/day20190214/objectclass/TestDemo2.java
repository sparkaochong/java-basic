package com.ac.day20190214.objectclass;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 覆写Object类toString()方法，实现打印对象信息操作
 */
class Person1{
    private String name;
    private int age;
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "姓名：" + this.name + " 年龄：" + this.age;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Person1 p =new Person1("张三", 30);
        System.out.println(p);
    }
}
