package com.ac.day20190214.objectclass;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 覆写Object类equals()方法，实现对象比较操作
 */
class Person2{
    private String name;
    private int age;
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return true;
        }
        if(!(obj instanceof Person2)){
            return false;
        }
        Person2 per = (Person2)obj;
        if(this.name.equals(per.name) && this.age == per.age){
            return true;
        }
        return false;
    }

    public String toString(){
        return "姓名：" + this.name + " 年龄：" + this.age;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Person2 p1 =new Person2("张三", 30);
        Person2 p2 =new Person2("张三", 20);
        System.out.println(p1.equals("猪"));
    }
}
