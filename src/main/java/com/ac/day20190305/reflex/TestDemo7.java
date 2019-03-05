package com.ac.day20190305.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: java-basic
 * @description: 反射调用有参构造方法
 * @author: Mr.Ao
 * @create: 2019-03-05 15:38
 **/
class Person1{
    private String name;
    private int age;

    public Person1(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo7 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.ac.day20190305.reflex.Person1");
            Constructor<?> cons = cls.getConstructor(String.class,int.class);
            Person1 per1 = (Person1) cons.newInstance("张三",10);
            System.out.println(per1);
        } catch (InstantiationException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
