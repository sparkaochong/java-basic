package com.ac.day20190221.advanced_pro;

/**
 * Created by Chong Ao on 2019/2/21.
 * �̳�Thread��ʵ�ֶ��߳�
 */
class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int x = 0;x<10;x++){
            System.out.println(this.name + ", x= " + x);
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("�߳�A");
        MyThread mt2 = new MyThread("�߳�B");
        MyThread mt3 = new MyThread("�߳�C");
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
