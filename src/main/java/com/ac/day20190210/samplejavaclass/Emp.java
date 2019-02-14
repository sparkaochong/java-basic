package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class Emp {
    private int empno;  //雇员编号
    private String ename;   //雇员姓名
    private String job; //雇员职位
    private double sal; //雇员薪资
    private double comm;    //雇员奖金
    private Emp mgr;    //雇员领导，一个雇员有一个领导
    private Dept dept;  //一个雇员属于一个部门

    public Emp(){}

    public Emp(int empno, String ename, String job, double sal, double comm){
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.comm = comm;
    }

    public void setEmpno(int empno){
        this.empno = empno;
    }

    public int getEmpno(){
        return this.empno;
    }

    public void setEname(String ename){
        this.ename = ename;
    }

    public String getEname(){
        return this.ename;
    }

    public void setJob(String job){
        this.job = job;
    }

    public String getJob(){
        return this.job;
    }

    public void setSal(double sal){
        this.sal = sal;
    }

    public double getSal(){
        return this.sal;
    }

    public void setComm(double comm){
        this.comm = comm;
    }

    public void setMgr(Emp mgr){
        this.mgr = mgr;
    }

    public Emp getMgr(){
        return this.mgr;
    }

    public void setDept(Dept dept){
        this.dept = dept;
    }

    public Dept getDept(){
        return this.dept;
    }

    public String getInfo(){
        return "雇员编号：" + this.empno +
                " 雇员姓名：" + this.ename +
                " 雇员职位：" + this.job +
                " 雇员薪资：" + this.sal +
                " 雇员奖金：" + this.comm;
    }
}
