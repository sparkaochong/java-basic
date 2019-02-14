package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class Course {
    private int cid;    //�γ�ID
    private String cname;   //�γ�����
    private int ctime;  //�γ�ʱ��
    private String content; //�γ�����
    private StudentCourse[] scs;  //�γ̶�Ӧ��ѧ����Ϣ

    public Course(){}

    public Course(int cid, String cname, int ctime, String content){
        this.cid = cid;
        this.cname = cname;
        this.ctime = ctime;
        this.content = content;
    }

    public void setScs(StudentCourse[] scs){
        this.scs = scs;
    }

    public StudentCourse[] getScs(){
        return scs;
    }

    public void setCid(int cid){
        this.cid = cid;
    }

    public int getCid(){
        return this.cid;
    }

    public void setCname(String cname){
        this.cname = cname;
    }

    public String getCname(){
        return this.cname;
    }

    public void setCtime(int ctime){
        this.cname = cname;
    }

    public int getCtime(){
        return this.ctime;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", ctime=" + ctime +
                ", content='" + content + '\'' +
                '}';
    }
}
