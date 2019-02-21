package com.ac.day20190221.interface_enhance;

/**
 * Created by Chong Ao on 2019/2/21.
 * �ӿ����涨����ͨ����
 */
interface Fruit{
    public void eat();
    default void clear(){   //�з��������ͨ����
        System.out.println("��ǰҪϴ�ɾ���");
    }
}
class Apple implements Fruit{   //������3000W����
    @Override
    public void eat() {
        Fruit.super.clear();
        System.out.println("��ƻ����");
    }

    @Override
    public void clear() {
        System.out.println("��Ƥ��");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Fruit f = new Apple();
        f.eat();
        f.clear();
    }
}
