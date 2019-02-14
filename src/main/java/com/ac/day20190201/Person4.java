package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Person4 {
    private String name;
    private int age;
    static String country = "中华人民共和国";

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return "姓名：" + this.name + " 年龄：" + this.age + " 国家：" + this.country;
    }
}
