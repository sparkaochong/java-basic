package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Person2 {
    private String name;
    private int pid;
    private Car car;

    public Person2(String name, int pid) {
        this.name = name;
        this.pid = pid;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
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
