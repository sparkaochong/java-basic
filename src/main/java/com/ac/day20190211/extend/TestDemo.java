package com.ac.day20190211.extend;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class TestDemo {
    public static void main(String[] args) {
        Student1 stu = new Student1();  //ʵ��������Student1
        stu.setName("����");
        stu.setAge(18);
        stu.setSchool("�廪��ѧ");
//        System.out.println("������" + stu.getName() + " ���䣺" + stu.getAge() + " ѧУ��" + stu.getSchool());
        System.out.println(stu.getInfo());
    }
}
