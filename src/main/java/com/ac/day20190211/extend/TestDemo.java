package com.ac.day20190211.extend;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class TestDemo {
    public static void main(String[] args) {
        Student1 stu = new Student1();  //实例化子类Student1
        stu.setName("张三");
        stu.setAge(18);
        stu.setSchool("清华大学");
//        System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge() + " 学校：" + stu.getSchool());
        System.out.println(stu.getInfo());
    }
}
