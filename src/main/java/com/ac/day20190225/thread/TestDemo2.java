package com.ac.day20190225.thread;

/**
 * @program: java-basic
 * @description: 线程的休眠
 * @author: Mr.Ao
 * @create: 2019-02-25 21:26
 **/
class MyThread2 implements Runnable{
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
public class TestDemo2 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        new Thread(mt,"线程A").start();
        new Thread(mt,"线程B").start();
        new Thread(mt,"线程C").start();
    }
}
