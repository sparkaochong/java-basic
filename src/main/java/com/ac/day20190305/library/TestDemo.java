package com.ac.day20190305.library;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: java-basic
 * @description: 观察者模式
 * @author: Mr.Ao
 * @create: 2019-03-05 19:56
 **/
class House extends Observable{
    //房子价钱
    private double price;
    public House(double price){
        this.price = price;
    }

    public void setPrice(double price) {
        //房价上涨才有人关注
        if(price > this.price){
            //已经发生了改变
            super.setChanged();
            //通知所有观察者房价发生了改变
            super.notifyObservers(price);
        }
        this.price = price;
    }
}
class HousePriceObserver implements Observer {
    private String name;

    public HousePriceObserver(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        //房子的信息发生了变化
        if(o instanceof House){
            if(arg instanceof Double){
                double newPrice = (Double) arg;
                System.out.println("房价上涨至：" + newPrice);
            }
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        House house = new House(3000000);
        HousePriceObserver housePriceObserver1 = new HousePriceObserver("张三");
        HousePriceObserver housePriceObserver2 = new HousePriceObserver("李四");
        HousePriceObserver housePriceObserver3 = new HousePriceObserver("王二");
        house.addObserver(housePriceObserver1);
        house.addObserver(housePriceObserver2);
        house.addObserver(housePriceObserver3);
        house.setPrice(5000000);
    }
}
