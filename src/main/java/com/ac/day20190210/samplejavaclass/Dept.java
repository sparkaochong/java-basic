package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class Dept {
    private int deptno; //���ű��
    private String dname;   //��������
    private String loc; //λ����Ϣ
    private Emp[] emps; //һ�������ж����Ա

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
        return "���ű�ţ�" + this.deptno +
                " �������ƣ�" + this.dname +
                " ����λ�ã�" + this.loc;
    }
}
