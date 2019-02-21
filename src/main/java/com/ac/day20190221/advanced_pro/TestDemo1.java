package com.ac.day20190221.advanced_pro;

/**
 * Created by Chong Ao on 2019/2/21.
 * ʵ��Runnable�ӿ�ʵ�ֶ��߳�
 */
class MyThread1 implements Runnable{
    private String name;
    public MyThread1(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int x = 0;x<10;x++){
            System.out.println(this.name + ", x= " + x);
        }
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1("�߳�A");
        MyThread1 mt2 = new MyThread1("�߳�B");
        MyThread1 mt3 = new MyThread1("�߳�C");
        new Thread(mt1).start();
        new Thread(mt2).start();
        new Thread(mt3).start();
    }
}
