package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Person2CarTest {
    public static void main(String[] args) {
        Person2 per = new Person2("张三", 01);
        Car car = new Car("法拉利F3");
        per.setCar(car);
        car.setPerson(per);
        System.out.println(per.getPersonInfo());
        System.out.println(per.getCar().getCarInfo());  //代码链
        System.out.println(car.getCarInfo());
        System.out.println(car.getPerson().getPersonInfo());
    }
}
