package com.ac.day20190214.objectclass;

/**
 * Created by aochong Cotter on 2019/2/14.
 * ��дObject��toString()������ʵ�ִ�ӡ������Ϣ����
 */
class Person1{
    private String name;
    private int age;
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "������" + this.name + " ���䣺" + this.age;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Person1 p =new Person1("����", 30);
        System.out.println(p);
    }
}
