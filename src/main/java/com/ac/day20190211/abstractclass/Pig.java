package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 * ģ�����ģʽ����
 */
public class Pig extends Action{
    @Override
    public void eat() {
        System.out.println("�����ڳ���ʳ��");
    }

    @Override
    public void sleep() {
        System.out.println("���������죡");
    }

    @Override
    public void work() {
        System.out.println("��Ṥ���Ͳ������ˣ�");
    }
}
