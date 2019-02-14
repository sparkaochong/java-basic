package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class Student {
    private int sid;    //学生编号
    private String sname;   //学生姓名
    private StudentCourse[] scs;  //学生选修的课程信息

    public Student(){}

    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
    public void setScs(StudentCourse[] scs){
        this.scs = scs;
    }

    public StudentCourse[] getScs(){
        return scs;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
