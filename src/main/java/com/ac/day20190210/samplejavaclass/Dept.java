package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class Dept {
    private int deptno; //部门编号
    private String dname;   //部门名称
    private String loc; //位置信息
    private Emp[] emps; //一个部门有多个雇员

    public Dept(){}

    public Dept(int deptno, String dname, String loc){
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public void setDeptno(int deptno){
        this.deptno = deptno;
    }

    public int getDeptno(){
        return this.deptno;
    }

    public void setDname(String dname){
        this.dname = dname;
    }

    public void setLoc(String loc){
        this.loc = loc;
    }

    public String getLoc(){
        return this.loc;
    }

    public void setEmps(Emp[] emps){
        this.emps = emps;
    }

    public Emp[] getEmps(){
        return this.emps;
    }

    public String getInfo(){
        return "部门编号：" + this.deptno +
                " 部门名称：" + this.dname +
                " 部门位置：" + this.loc;
    }
}
