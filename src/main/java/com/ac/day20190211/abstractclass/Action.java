package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 * 模板设计模式案例
 */
public abstract class Action {//定义的是行为，行为一定不是具体的
    public static final int EAT = 1;
    public static final int SLEEP = 2;
    public static final int WORK = 5;
    public void command(int flag){//执行命令
        switch (flag){//数值的判断用switch是最好的
            case EAT : {
                this.eat();
                break;
            }
            case SLEEP : {
                this.sleep();
                break;
            }
            case WORK : {
                this.work();
                break;
            }
        }
    }
    //因为这些具体的行为如何执行不知道，需要交由子类根据实际情况完成
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}
