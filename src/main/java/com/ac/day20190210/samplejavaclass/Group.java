package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 * Ȩ����ʵ����
 */
public class Group {
    private int gid;    //Ȩ������
    private String title;   //Ȩ��������
    private Auth[] auths;   //Ȩ�����Ӧ���Ȩ��
    private Role[] roles;   //һ��Ȩ�����Ӧ�����ɫ

    public Group(){}

    public Group(int gid, String title) {
        this.gid = gid;
        this.title = title;
    }

    public void setRoles(Role[] roles){
        this.roles = roles;
    }

    public Role[] getRoles(){
        return roles;
    }

    public void setAuths(Auth[] auths){
        this.auths = auths;
    }

    public Auth[] getAuths(){
        return auths;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Group{" +
                "gid=" + gid +
                ", title='" + title + '\'' +
                '}';
    }
}
