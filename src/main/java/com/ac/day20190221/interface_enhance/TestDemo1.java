package com.ac.day20190221.interface_enhance;

/**
 * Created by Chong Ao on 2019/2/21.
 */
interface Fruit1{
    public void eat();
    default void clear(){
        System.out.println("吃前洗干净！");
    }
    public static Fruit1 getInstance(){
        return new Fruit1() {
            @Override
            public void eat() {
                clear();    //static方法可以调用非static方法
                System.out.println("吃水果！");
            }
        };
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Fruit1.getInstance().eat();
    }
}
