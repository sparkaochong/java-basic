package com.ac.day20190314.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @program: java-basic
 * @description: TreeSet的使用
 * @author: Mr.Ao
 * @create: 2019-03-14 12:02
 **/
class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}\n";
    }

    @Override
    public int compareTo(Object o) {
        Person per = (Person) o;
        if(this.age > per.age){
            return 1;
        }else if(this.age < per.age){
            return -1;
        }else{
            return this.name.compareTo(per.name);
        }
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Set<Person> all = new HashSet<>();
        all.add(new Person("张三",20));
        all.add(new Person("张三",20));
        all.add(new Person("李四",30));
        all.add(new Person("王二",18));
        all.add(new Person("麻子",23));
        all.add(new Person("张三",18));
        System.out.println(all);
    }
}
