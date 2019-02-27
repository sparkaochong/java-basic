package com.ac.day20190227.thread;

/**
 * @program: java-basic
 * @description: 生产者消费者模型
 * @author: Mr.Ao
 * @create: 2019-02-27 09:07
 **/
public class TestDemo {
    public static void main(String[] args) {
        Info info = new Info();
        Productor pro = new Productor(info);
        Consumer c = new Consumer(info);
        new Thread(pro).start();
        new Thread(c).start();
    }
}
