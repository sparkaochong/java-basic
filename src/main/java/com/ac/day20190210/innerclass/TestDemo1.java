package com.ac.day20190210.innerclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo1 {
    public static void main(String[] args) {
        new Person();
        new Person();
    }
}

class Person{
    public Person(){
        System.out.println("B ���췽��");
    }

    {
        System.out.println("A �����");
    }
}
