package com.ac.day20190211.extend;

/**
 * Created by Chong Ao on 2019/2/11.
 */
class A1{
    private String name;
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
class B1 extends A1{}
public class TestJava1 {
    public static void main(String[] args) {
        B1 b = new B1();
        b.setName("уехЩ");
        System.out.println(b.getName());
    }
}
