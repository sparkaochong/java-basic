package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 * 模板设计模式案例
 */
public class Pig extends Action{
    @Override
    public void eat() {
        System.out.println("猪正在吃猪食！");
    }

    @Override
    public void sleep() {
        System.out.println("猪正在养膘！");
    }

    @Override
    public void work() {
        System.out.println("猪会工作就不是猪了！");
    }
}
