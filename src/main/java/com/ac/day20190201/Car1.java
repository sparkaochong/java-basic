package com.ac.day20190201;

/**
 * Created by Chong Ao on 2019/2/1.
 */
public class Car1 {
    private String cname;
    private Person3 person;

    public Car1(String cname) {
        this.cname = cname;
    }

    public void setPerson(Person3 person) {
        this.person = person;
    }

    public Person3 getPerson() {
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
