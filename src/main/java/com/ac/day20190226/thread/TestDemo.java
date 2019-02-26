package com.ac.day20190226.thread;

/**
 * @program: java-basic
 * @description: ��Ʊ����ͬ������
 * @author: Mr.Ao
 * @create: 2019-02-26 18:29
 **/
class MyThread implements Runnable{
    private int tricket = 5;

    @Override
    public void run() {
        for(int x=0;x<10;x++){
            if(this.tricket>0){
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + ", trick = " + this.tricket--);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt,"Ʊ����A");
        Thread t2 = new Thread(mt,"Ʊ����B");
        Thread t3 = new Thread(mt,"Ʊ����C");
        t1.start();
        t2.start();
        t3.start();
    }
}
