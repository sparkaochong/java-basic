package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class Emp {
    private int empno;  //��Ա���
    private String ename;   //��Ա����
    private String job; //��Աְλ
    private double sal; //��Աн��
    private double comm;    //��Ա����
    private Emp mgr;    //��Ա�쵼��һ����Ա��һ���쵼
    private Dept dept;  //һ����Ա����һ������

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
        return "��Ա��ţ�" + this.empno +
                " ��Ա������" + this.ename +
                " ��Աְλ��" + this.job +
                " ��Աн�ʣ�" + this.sal +
                " ��Ա����" + this.comm;
    }
}
