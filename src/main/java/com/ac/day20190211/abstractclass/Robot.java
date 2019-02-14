package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class Robot extends Action{
    @Override
    public void eat() {
        System.out.println("机器人补充能量！");
    }

    @Override
    public void sleep() {
        System.out.println("机器人正在充电！");
    }

    @Override
    public void work() {
        System.out.println("机器人正在工作！");
    }
}
