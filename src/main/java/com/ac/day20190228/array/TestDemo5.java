package com.ac.day20190228.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: java-basic
 * @description: 对象数组排序
 * @author: Mr.Ao
 * @create: 2019-02-28 22:20
 **/
class Person2{
    private String name;
    private int age;

    public Person2(String name,int age){
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class PersonComparator implements Comparator<Person2> {
    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.getAge() - o2.getAge();
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        Person2[] per = new Person2[]{
                new Person2("张三",20),
                new Person2("李四",35),
                new Person2("王二",18)
        };
        Arrays.sort(per,new PersonComparator());
        System.out.println(Arrays.toString(per));
    }
}
