package com.ac.day20190221.annotation;

/**
 * Created by Chong Ao on 2019/2/21.
 * ��дע��
 */
class Person{
    @Override
    public String toString(){   //������Ҫ���з����ĸ�д
        return "����һ���ˡ�";
    }
}
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(new Person());
    }
}
