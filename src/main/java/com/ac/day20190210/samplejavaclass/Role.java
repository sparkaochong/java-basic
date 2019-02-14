package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 * 角色实体类
 */
public class Role {
    private int rid;    //角色编号
    private String title;   //角色名称
    private User[] users;   //一个角色对应多个用户
    private Group[] groups; //一个角色对应多个权限组

    public Role(){}

    public Role(int rid, String title) {
        this.rid = rid;
        this.title = title;
    }

    public void setGroups(Group[] groups){
        this.groups = groups;
    }

    public Group[] getGroups(){
        return groups;
    }

    public void setUsers(User[] users){
        this.users = users;
    }

    public User[] getUsers(){
        return users;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", title='" + title + '\'' +
                '}';
    }
}
