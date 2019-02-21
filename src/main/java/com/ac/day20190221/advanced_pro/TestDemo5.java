package com.ac.day20190221.advanced_pro;

/**
 * Created by Chong Ao on 2019/2/21.
 * RunnableÊµÏÖÂôÆ±
 */
class MyThread5 implements Runnable{
    private int ticket  = 5;
    @Override
    public void run() {

        for (int x = 0;x<50;x++){
            if(ticket>0) System.out.println("ÂôÆ±£¬ticket = " + this.ticket --);
        }
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        MyThread5 mt = new MyThread5();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
