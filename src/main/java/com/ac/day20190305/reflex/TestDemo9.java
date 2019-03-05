package com.ac.day20190305.reflex;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: java-basic
 * @description: 反射调用属性（成员）
 * @author: Mr.Ao
 * @create: 2019-03-05 15:38
 **/
class Person3{
    private String name;
}
public class TestDemo9 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.ac.day20190305.reflex.Person3");
            Object obj = cls.newInstance();
            Field nameField = cls.getDeclaredField("name");
            nameField.setAccessible(true);
            //等价于obj.name = "张三"
            nameField.set(obj,"张三");
            System.out.println(nameField.get(obj));
        } catch (ClassNotFoundException | NoSuchFieldException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static String initCap(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
