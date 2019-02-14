package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 * �û�ʵ����
 */
public class User {
    private String uid; //�û����
    private String username;    //�û��˻�
    private String password;    //�˻�����
    private Role role;  //һ���û�һ����ɫ

    public User(){}

    public User(String uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public void setRole(Role role){
        this.role = role;
    }

    public Role getRole(){
        return this.role;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
