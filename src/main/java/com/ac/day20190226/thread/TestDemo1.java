package com.ac.day20190226.thread;

/**
 * @program: java-basic
 * @description: synchronized同步代码块
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
        Thread t1 = new Thread(mt,"票贩子A");
        Thread t2 = new Thread(mt,"票贩子B");
        Thread t3 = new Thread(mt,"票贩子C");
        t1.start();
        t2.start();
        t3.start();
    }
}
