package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 * 权限组实体类
 */
public class Group {
    private int gid;    //权限组编号
    private String title;   //权限组名称
    private Auth[] auths;   //权限组对应多个权限
    private Role[] roles;   //一个权限组对应多个角色

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
