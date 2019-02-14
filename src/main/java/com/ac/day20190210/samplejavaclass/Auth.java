package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 * Ȩ��ʵ����
 */
public class Auth {
    private int aid;    //Ȩ�ޱ��
    private String title;   //Ȩ������
    private String url; //Ȩ��·��
    private Group group;    //Ȩ������Ȩ����

    public Auth(){}

    public Auth(int aid, String title, String url){
        this.aid = aid;
        this.title = title;
        this.url = url;
    }

    public void setGroup(Group group){
        this.group = group;
    }

    public Group getGroup(){
        return group;
    }

    public void setAid(int aid){
        this.aid = aid;
    }

    public int getAid(){
        return aid;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "aid=" + aid +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
