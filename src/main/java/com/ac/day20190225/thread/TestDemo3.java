package com.ac.day20190225.thread;

/**
 * @program: java-basic
 * @description: 线程中断
 * @author: Mr.Ao
 * @create: 2019-02-25 21:37
 **/
class MyThread3 implements Runnable{
    @Override
    public void run() {
        for(int x=0;x<100;x++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ", x = " + x);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class TestDemo3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 mt = new MyThread3();
        Thread t = new Thread(mt,"线程A");
        t.start();
        Thread.sleep(5000);
        t.interrupt();
    }
}
