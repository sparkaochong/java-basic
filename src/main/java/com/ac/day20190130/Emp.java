package com.ac.day20190130;

/**
 * Created by Chong Ao on 2019/1/30.
 */
public class Emp {
    private String name;
    private String job;
    private String dept;
    private double sal;

    public Emp(){
        this("无名氏", "待定", "后勤部", 0.0);
    }

    public Emp(String name){
        this(name, "办事员", "技术部", 700.0);
    }

    public Emp(String name, String dept){
        this(name, "工程师", dept, 3000.0);
    }

    public Emp(String name, String job, String dept, double sal){
        this.name = name;
        this.job = job;
        this.dept = dept;
        this.sal = sal;
    }

    public String getInfo(){
        return "姓名：" + name + " 职位：" + job + " 部门：" + dept + " 工资：" + sal;
    }
}
