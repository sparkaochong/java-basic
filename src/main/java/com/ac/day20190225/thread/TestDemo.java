package com.ac.day20190225.thread;

/**
 * @program: java-basic
 * @description: 线程的命名和取得
 * @author: Mr.Ao
 * @create: 2019-02-25 21:07
 **/
class MyThread implements Runnable{
    @Override
    public void run() {
        for(int x =0;x<10;x++){
            System.out.println(Thread.currentThread().getName() + ", x = " + x);
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt,"线程A").start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
