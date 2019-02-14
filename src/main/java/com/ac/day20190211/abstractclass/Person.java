package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 * 模板设计模式案例
 */
public class Person extends Action {
    @Override
    public void eat() {
        System.out.println("人正在吃饭！");
    }

    @Override
    public void sleep() {
        System.out.println("人正在睡觉！");
    }

    @Override
    public void work() {
        System.out.println("人正在工作！");
    }
}
