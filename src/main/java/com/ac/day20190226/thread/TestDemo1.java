package com.ac.day20190226.thread;

/**
 * @program: java-basic
 * @description: synchronizedͬ�������
 * @author: Mr.Ao
 * @create: 2019-02-26 18:29
 **/
class MyThread1 implements Runnable{
    private int tricket = 500;

    @Override
    public void run() {
        for(int x=0;x<1000;x++){
            synchronized (this) {
                if (this.tricket > 0) {
                    try {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + ", trick = " + this.tricket--);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        Thread t1 = new Thread(mt,"Ʊ����A");
        Thread t2 = new Thread(mt,"Ʊ����B");
        Thread t3 = new Thread(mt,"Ʊ����C");
        t1.start();
        t2.start();
        t3.start();
    }
}
