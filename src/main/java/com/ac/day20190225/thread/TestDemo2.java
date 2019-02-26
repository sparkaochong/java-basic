package com.ac.day20190225.thread;

/**
 * @program: java-basic
 * @description: �̵߳�����
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
        new Thread(mt,"�߳�A").start();
        new Thread(mt,"�߳�B").start();
        new Thread(mt,"�߳�C").start();
    }
}
