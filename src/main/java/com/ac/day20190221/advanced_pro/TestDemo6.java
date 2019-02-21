package com.ac.day20190221.advanced_pro;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Chong Ao on 2019/2/21.
 * Callable实现卖票
 */
class MyThread6 implements Callable<String> {
    private int ticket  = 5;
    @Override
    public String call() {
        for (int x = 0;x<50;x++){
            if(ticket>0) System.out.println("卖票，ticket = " + this.ticket --);
        }
        return "票卖完了！";
    }
}
public class TestDemo6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> cal = new MyThread6();
        FutureTask<String> task = new FutureTask<>(cal);
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(task.get());
    }
}
