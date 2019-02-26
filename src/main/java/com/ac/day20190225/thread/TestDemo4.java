package com.ac.day20190225.thread;

/**
 * @program: java-basic
 * @description: 线程的优先级
 * @author: Mr.Ao
 * @create: 2019-02-25 21:26
 **/
class MyThread4 implements Runnable{
    @Override
    public void run() {
        for(int x=0;x<100;x++){
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ", x = " + x);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        MyThread4 mt = new MyThread4();
        Thread t1 = new Thread(mt,"线程A");
        Thread t2 = new Thread(mt,"线程B");
        Thread t3 = new Thread(mt,"线程C");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
