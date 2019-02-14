package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name ){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getInfo(){
        return "姓名：" + this.name + " 年龄：" + this.age;
    }

}
