package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 * ģ�����ģʽ����
 */
public class Robot extends Action{
    @Override
    public void eat() {
        System.out.println("�����˲���������");
    }

    @Override
    public void sleep() {
        System.out.println("���������ڳ�磡");
    }

    @Override
    public void work() {
        System.out.println("���������ڹ�����");
    }
}
