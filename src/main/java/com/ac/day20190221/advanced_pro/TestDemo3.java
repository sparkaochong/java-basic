package com.ac.day20190221.advanced_pro;

/**
 * Created by Chong Ao on 2019/2/21.
 * 使用Lamda表达式启动线程
 */
class MyThread3 implements Runnable{
    private String name;
    public MyThread3(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int x = 0;x<10;x++){
            System.out.println(this.name + ", x= " + x);
        }
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        String name = "线程对象";
        new Thread(() -> {
            for (int x = 0;x<10;x++){
                System.out.println(name + ", x= " + x);
            }
        }).start();
    }
}
