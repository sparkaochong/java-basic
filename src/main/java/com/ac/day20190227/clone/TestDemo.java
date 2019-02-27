package com.ac.day20190227.clone;

/**
 * @program: java-basic
 * @description: 对象克隆
 * @author: Mr.Ao
 * @create: 2019-02-27 15:10
 **/
class Person implements Cloneable{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo {
    public static void main(String[] args) {
        try {
            Person per = new Person("张三",20);
            Person per1 = (Person) per.clone();
            per1.setAge(30);
            System.out.println(per);
            System.out.println(per1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
