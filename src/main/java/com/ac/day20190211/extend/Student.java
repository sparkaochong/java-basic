package com.ac.day20190211.extend;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class Student {
    private String name;
    private int age;
    private String school;

    public Student(){}

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public String getSchool(){
        return school;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
