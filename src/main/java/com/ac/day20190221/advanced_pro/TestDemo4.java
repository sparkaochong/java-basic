package com.ac.day20190221.advanced_pro;

/**
 * Created by Chong Ao on 2019/2/21.
 * ThreadÊµÏÖÂôÆ±
 */
class MyThread4 extends Thread{
    private int ticket  = 5;
    @Override
    public void run() {

        for (int x = 0;x<50;x++){
            if(ticket>0) System.out.println("ÂôÆ±£¬ticket = " + this.ticket --);
        }
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        MyThread4 mt1 = new MyThread4();
        MyThread4 mt2 = new MyThread4();
        MyThread4 mt3 = new MyThread4();
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
