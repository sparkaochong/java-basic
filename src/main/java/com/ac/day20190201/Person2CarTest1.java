package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Person2CarTest1 {
    public static void main(String[] args) {
        //根据已有的结构设置内容
        Person3 per = new Person3("张三", 01);
        Person3 chd = new Person3("李四", 001);   //有了孩子
        per.setChild(chd);  //李四是张三的孩子
        Car1 car = new Car1("法拉利F3");     //张三的车
        Car1 chdCar = new Car1("马萨拉蒂");   //李四的车
        per.setCar(car);    //张三有了车
        chd.setCar(chdCar); //李四有了车
        car.setPerson(per); //车的主人是张三
        chdCar.setPerson(chd);  //车的主人是李四

        //第二步：根据关系取出数据
        System.out.println(per.getChild().getPersonInfo());   //找到一个人的孩子的信息
        System.out.println(car.getPerson().getChild().getCar().getCarInfo());   //通过父亲的车找到父亲的信息，找到父亲的孩子的车的信息
    }
}
