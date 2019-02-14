package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 * 权限实体类
 */
public class Auth {
    private int aid;    //权限编号
    private String title;   //权限名称
    private String url; //权限路径
    private Group group;    //权限属于权限组

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
