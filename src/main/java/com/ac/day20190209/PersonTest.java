package com.ac.day20190209;

/**
 * Created by Chong Ao on 2019/2/9.
 */
public class PersonTest {
    public static void main(String[] args) {
        //这个时候没有实例化对象产生
        System.out.println(Person.getCountry());
        Person.setCountry("中国-清朝");
        System.out.println(Person.getCountry());
        System.out.println(new Person("李四" , 250).getInfo());
    }
}
