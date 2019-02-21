package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * 引用某个对象的方法
 */
@FunctionalInterface
interface IMessage5<R,F,S>{
    public R create(F f,S s);
}
class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
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
public class TestDemo7 {
    public static void main(String[] args) {
        IMessage5<Person,String,Integer> msg = Person :: new;
        System.out.println(msg.create("张三",20));
    }
}
