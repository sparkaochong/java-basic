package com.ac.day20190225.thread;

/**
 * @program: java-basic
 * @description: �߳������
 * @author: Mr.Ao
 * @create: 2019-02-25 21:18
 **/
class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread�����ࣺ" + Thread.currentThread().getName());
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        new Thread(mt).start();
        mt.run();
    }
}
