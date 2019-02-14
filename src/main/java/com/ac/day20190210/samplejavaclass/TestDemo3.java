package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo3 {
    public static void main(String[] args) {
        //第一步：根据表结构设置关系
        //1.定义单独类对象
        User user1 = new User("user-a", "用户A", "123456");
        User user2 = new User("user-b", "用户B", "123456");
        User user3 = new User("user-c", "用户C", "123456");
        //2.定义权限
        Auth auth1 = new Auth(1, "新闻管理", "http://www.mldn.com/news");
        Auth auth2 = new Auth(2, "用户管理", "http://www.mldn.com/users");
        Auth auth3 = new Auth(3, "备份管理", "http://www.mldn.com/bks");
        Auth auth4 = new Auth(4, "缓存管理", "http://www.mldn.com/caches");
        Auth auth5 = new Auth(5, "数据管理", "http://www.mldn.com/datas");
        //3.定义权限组信息
        Group g1 = new Group(1,"数据管理");
        Group g2 = new Group(2,"人事管理");
        Group g3 = new Group(3,"信息管理");
        //4.定义角色信息
        Role r1 = new Role(10,"超级管理员角色");
        Role r2 = new Role(11,"普通管理员角色");
        //5.设置权限组与权限的关系，一对多关系
        auth1.setGroup(g1); //权限与权限组的关系
        auth2.setGroup(g1); //权限与权限组的关系
        auth3.setGroup(g2); //权限与权限组的关系
        auth4.setGroup(g2); //权限与权限组的关系
        auth5.setGroup(g3); //权限与权限组的关系
        g1.setAuths(new Auth[]{auth1, auth2});
        g2.setAuths(new Auth[]{auth3, auth4});
        g3.setAuths(new Auth[]{auth5});
        //6.权限组与角色关系
        r1.setGroups(new Group[]{g1, g2, g3});
        r2.setGroups(new Group[]{g2, g3});
        g1.setRoles(new Role[]{r1});
        g2.setRoles(new Role[]{r1, r2});
        g3.setRoles(new Role[]{r1, r2});
        //7.定义用户与角色的关系
        user1.setRole(r1);
        user2.setRole(r2);
        user3.setRole(r2);
        r1.setUsers(new User[]{user1});
        r2.setUsers(new User[]{user2, user3});
        //第二步：根据要求取出数据
        //可以根据一个用户输出它对应的角色以及每个角色对应的权限，以及包含的具体的权限详情；
        System.out.println(user1.toString());
        System.out.println("\t|- 【角色】" + user1.getRole().toString());
        for(int x = 0; x<user1.getRole().getGroups().length; x++){
            System.out.println("\t\t|- 【权限组】" + user1.getRole().getGroups()[x].toString());
            for(int y = 0;y<user1.getRole().getGroups()[x].getAuths().length; y++){
                System.out.println("\t\t\t|- 【权限】" + user1.getRole().getGroups()[x].getAuths()[y].toString());
            }
        }
        System.out.println("\n=============================================\n");
        //一个权限可以输出具备此权限的角色，以及具备此角色的所有用户，同时输出该权限的所有权限详情；
        System.out.println(auth1.toString());   //输出一个权限信息
        //通过权限找到对应的权限组，一个权限组有多个角色
        for(int x =0;x<auth1.getGroup().getRoles().length;x++){
            System.out.println("\t|- 【角色】" + auth1.getGroup().getRoles()[x].toString());
            for(int y = 0;y<auth1.getGroup().getRoles()[x].getUsers().length;y++){
                System.out.println("\t\t|- 【用户】" + auth1.getGroup().getRoles()[x].getUsers()[y].toString());
            }
        }
        System.out.println("\n=============================================\n");
        //一个角色可以输出它所包含的用户，每个用户对应的具体的权限，以及权限详情；
        System.out.println(r1.toString());
        for(int x=0;x<r1.getUsers().length;x++){
            System.out.println("\t|- 【用户】" + r1.getUsers()[x].toString());
            for(int y = 0;y<r1.getGroups().length;y++){
                System.out.println("\t\t|- 【权限组】" + r1.getGroups()[y].toString());
                for(int z = 0;z<r1.getGroups()[y].getAuths().length;z++){
                    System.out.println("\t\t\t|- 【权限】" + r1.getGroups()[y].getAuths()[z].toString());
                }
            }
        }
    }
}
