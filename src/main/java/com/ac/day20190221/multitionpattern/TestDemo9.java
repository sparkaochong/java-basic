package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 */
enum Sex{
    MALE("ÄÐ"),FEMALE("Å®");
    private String title;
    private Sex(String title){
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
}
class Person{
    private String name;
    private int age;
    private Sex sex;

    public Person(String name,int age,Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
public class TestDemo9 {
    public static void main(String[] args) {
        Person per = new Person("ÕÅÈý",20,Sex.MALE);
        System.out.println(per);
    }
}
