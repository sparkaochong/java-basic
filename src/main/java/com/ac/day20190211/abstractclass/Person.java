package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class Person extends Action {
    @Override
    public void eat() {
        System.out.println("�����ڳԷ���");
    }

    @Override
    public void sleep() {
        System.out.println("������˯����");
    }

    @Override
    public void work() {
        System.out.println("�����ڹ�����");
    }
}
