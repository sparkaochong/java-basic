package com.ac.day20190211.extend;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class Person1 {
    private String name;
    private int age;

    public Person1(){}

    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getInfo(){
        return "ĞÕÃû£º" + this.name + " ÄêÁä£º" + this.age;
    }
}
