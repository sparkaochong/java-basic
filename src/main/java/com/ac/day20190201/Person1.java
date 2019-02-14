package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Person1 {
    private String name;
    private int age;
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name ){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    //此时需要接收一个要比较的对象（对象的本质就是数据的集合）
    //同时在本方法里面还有一个隐藏的对象：this
    //此时的compare()方法接收了自己本类的引用
    //由于此时的person参数对象在Person类中，所以可以直接访问私有属性
    public boolean compare(Person1 person){
        if (person == null) return false;
        if(this == person) return true;

        if(this.name.equals(person.name)&&this.age == person.age){
            return true;
        }
        return false;
    }

    public String getInfo(){
        return "姓名：" + this.name + " 年龄：" + this.age;
    }
}
