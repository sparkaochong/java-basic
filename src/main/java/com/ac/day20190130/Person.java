package com.ac.day20190130;

/**
 * Created by Chong Ao on 2019/1/30.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("【相当于50行代码】一个新的Person类对象实例化产生了！");
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
//        this.print();
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "姓名：" + name + " 年龄：" + age;
    }

    public void print() {
        System.out.println("**********************************");
    }
}
