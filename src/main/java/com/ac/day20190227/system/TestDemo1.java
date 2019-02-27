package com.ac.day20190227.system;

/**
 * @program: java-basic
 * @description: System类的使用
 * @author: Mr.Ao
 * @create: 2019-02-27 14:32
 **/
class Person{

    public Person(){
        System.out.println("张三诞生了！");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("张三挂了！");
        throw new Exception("老子还要再活500年！");
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Person per = new Person();
        per = null;
        System.gc();
    }
}
