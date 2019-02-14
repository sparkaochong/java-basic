package com.ac.day20190209;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Person1 {
    private String name;
    private int age;
    private static String country = "中华人民共和国";

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void setCountry(String c){
        country = c;
    }

    public static String getCountry(){
//        name = "张三";
//        getInfo();
        return country;
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
        System.out.println(this.country);
        System.out.println(this.getCountry());
        return "姓名：" + this.name + " 年龄：" + this.age + " 国家：" + this.country;
    }
}
