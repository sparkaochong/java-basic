package com.ac.day20190314.serializable;

import java.io.*;

/**
 * @program: java-basic
 * @description: 对象序列化
 * @author: Mr.Ao
 * @create: 2019-03-14 08:54
 **/
class Person implements Serializable{
    private String name;
    private transient int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) throws Exception {
//        ser(new Person("张三",20));
        dser();
    }

    public static void ser(Person per) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("E:" + File.separator + "person.txt")));
        oos.writeObject(per);
        oos.close();
    }

    public static void dser() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:" + File.separator + "person.txt")));
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
    }
}
