package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Car {
    private String cname;
    private Person2 person;

    public Car(String cname) {
        this.cname = cname;
    }

    public void setPerson(Person2 person) {
        this.person = person;
    }

    public Person2 getPerson() {
        return this.person;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCname() {
        return this.cname;
    }

    public String getCarInfo() {
        return "汽车名称：" + this.cname;
    }
}
