package com.ac.day20190221.advanced_pro;

/**
 * Created by Chong Ao on 2019/2/21.
 * 使用匿名内部类启动线程
 */
class MyThread2 implements Runnable{
    private String name;
    public MyThread2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int x = 0;x<10;x++){
            System.out.println(this.name + ", x= " + x);
        }
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            String name = "线程对象";
            @Override
            public void run() {
                for (int x = 0;x<10;x++){
                    System.out.println(name + ", x= " + x);
                }
            }
        }).start();
    }
}
