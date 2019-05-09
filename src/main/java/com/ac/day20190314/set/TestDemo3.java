package com.ac.day20190314.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @program: java-basic
 * @description: TreeSet的使用
 * @author: Mr.Ao
 * @create: 2019-03-14 12:02
 **/
class Person1{
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Person1 person1 = (Person1) o;
        return age == person1.age &&
                name.equals(person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        Set<Person1> all = new HashSet<>();
        all.add(new Person1("张三",20));
        all.add(new Person1("张三",20));
        all.add(new Person1("李四",30));
        all.add(new Person1("王二",18));
        all.add(new Person1("麻子",23));
        all.add(new Person1("张三",18));
        System.out.println(all);
    }
}
