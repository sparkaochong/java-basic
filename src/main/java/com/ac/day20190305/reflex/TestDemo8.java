package com.ac.day20190305.reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: java-basic
 * @description: 反射调用普通方法
 * @author: Mr.Ao
 * @create: 2019-03-05 15:38
 **/
class Person2{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class TestDemo8 {
    public static void main(String[] args) {
        try {
            String str = "name";
            Class<?> cls = Class.forName("com.ac.day20190305.reflex.Person2");
            Object obj = cls.newInstance();
            Method setName = cls.getMethod("set" + initCap(str),String.class);
            Method getName = cls.getMethod("get" + initCap(str));
            //等价于obj.setName("张三")
            setName.invoke(obj,"张三");
            //等价于obj.getName()
            System.out.println(getName.invoke(obj));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static String initCap(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
