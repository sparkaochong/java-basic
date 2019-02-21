package com.ac.day20190221.interface_enhance;

/**
 * Created by Chong Ao on 2019/2/21.
 * 接口里面定义普通方法
 */
interface Fruit{
    public void eat();
    default void clear(){   //有方法体的普通方法
        System.out.println("吃前要洗干净！");
    }
}
class Apple implements Fruit{   //假设有3000W子类
    @Override
    public void eat() {
        Fruit.super.clear();
        System.out.println("吃苹果！");
    }

    @Override
    public void clear() {
        System.out.println("削皮！");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Fruit f = new Apple();
        f.eat();
        f.clear();
    }
}
