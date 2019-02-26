package com.ac.day20190226.thread;

/**
 * @program: java-basic
 * @description: synchronized同步方法
 * @author: Mr.Ao
 * @create: 2019-02-26 18:29
 **/
class MyThread2 implements Runnable{
    private int tricket = 500;

    @Override
    public void run() {
        for(int x=0;x<1000;x++){
            this.sale();
        }
    }

    public synchronized void sale(){
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
public class TestDemo2 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread t1 = new Thread(mt,"票贩子A");
        Thread t2 = new Thread(mt,"票贩子B");
        Thread t3 = new Thread(mt,"票贩子C");
        t1.start();
        t2.start();
        t3.start();
    }
}
