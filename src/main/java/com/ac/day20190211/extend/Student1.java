package com.ac.day20190211.extend;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class Student1 extends Person1{
    //此时没有在Student1中定义任何的属性、方法
    private String school;

    public void setSchool(String school){
        this.school = school;
    }

    public String getSchool(){
        return school;
    }

    public String getInfo(){
        return super.getInfo() + " 学校：" + this.school;
    }
}
