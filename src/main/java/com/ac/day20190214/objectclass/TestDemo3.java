package com.ac.day20190214.objectclass;

/**
 * Created by aochong Cotter on 2019/2/14.
 * ��дObject��equals()������ʵ�ֶ���Ƚϲ���
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
        return "������" + this.name + " ���䣺" + this.age;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Person2 p1 =new Person2("����", 30);
        Person2 p2 =new Person2("����", 20);
        System.out.println(p1.equals("��"));
    }
}
