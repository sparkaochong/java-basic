package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class TestDemo6 {
    public static void main(String[] args) {
        fun(new Pig());
        System.out.println("\n=================================\n");
        fun(new Person());
        System.out.println("\n=================================\n");
        fun(new Robot());
    }

    public static void fun(Action act){//接收的是行为
        act.eat();
        act.sleep();
        act.work();
    }
}
