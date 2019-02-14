package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Person3 {
    private String name;    //姓名
    private int pid;    //编号
    private Car1 car;    //车
    private Person3 child; //孩子

    public Person3(String name, int pid) {
        this.name = name;
        this.pid = pid;
    }

    public Person3 getChild() {
        return child;
    }

    public void setChild(Person3 child) {
        this.child = child;
    }

    public void setCar(Car1 car) {
        this.car = car;
    }

    public Car1 getCar() {
        return this.car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPid() {
        return this.pid;
    }

    public String getPersonInfo() {
        return "姓名：" + this.name + " 编号：" + this.pid;
    }

}
