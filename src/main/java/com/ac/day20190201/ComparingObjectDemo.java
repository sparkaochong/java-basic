package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class ComparingObjectDemo {
    public static void main(String[] args) {
        Person perA = new Person("李四", 30);
        Person perB = new Person("李四", 30);
        if(perA.getName().equals(perB.getName()) && perA.getAge() == perB.getAge()){
            System.out.println("是同一个人！");
        }else{
            System.out.println("不是同一个人！");
        }
    }
}
