package com.ac.day20190228.array;

import java.util.Arrays;

/**
 * @program: java-basic
 * @description: 对象数组排序
 * @author: Mr.Ao
 * @create: 2019-02-28 22:20
 **/
class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name,int age){
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

    @Override
    public int compareTo(Person o) {
        if(this.age > o.age){
            return 1;
        }else if(this.age == o.age){
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Person[] per = new Person[]{
                new Person("张三",20),
                new Person("李四",35),
                new Person("王二",18)
        };
        Arrays.sort(per);
        System.out.println(Arrays.toString(per));
    }
}
