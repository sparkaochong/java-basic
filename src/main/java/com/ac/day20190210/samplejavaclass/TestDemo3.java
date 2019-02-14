package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo3 {
    public static void main(String[] args) {
        //��һ�������ݱ�ṹ���ù�ϵ
        //1.���嵥�������
        User user1 = new User("user-a", "�û�A", "123456");
        User user2 = new User("user-b", "�û�B", "123456");
        User user3 = new User("user-c", "�û�C", "123456");
        //2.����Ȩ��
        Auth auth1 = new Auth(1, "���Ź���", "http://www.mldn.com/news");
        Auth auth2 = new Auth(2, "�û�����", "http://www.mldn.com/users");
        Auth auth3 = new Auth(3, "���ݹ���", "http://www.mldn.com/bks");
        Auth auth4 = new Auth(4, "�������", "http://www.mldn.com/caches");
        Auth auth5 = new Auth(5, "���ݹ���", "http://www.mldn.com/datas");
        //3.����Ȩ������Ϣ
        Group g1 = new Group(1,"���ݹ���");
        Group g2 = new Group(2,"���¹���");
        Group g3 = new Group(3,"��Ϣ����");
        //4.�����ɫ��Ϣ
        Role r1 = new Role(10,"��������Ա��ɫ");
        Role r2 = new Role(11,"��ͨ����Ա��ɫ");
        //5.����Ȩ������Ȩ�޵Ĺ�ϵ��һ�Զ��ϵ
        auth1.setGroup(g1); //Ȩ����Ȩ����Ĺ�ϵ
        auth2.setGroup(g1); //Ȩ����Ȩ����Ĺ�ϵ
        auth3.setGroup(g2); //Ȩ����Ȩ����Ĺ�ϵ
        auth4.setGroup(g2); //Ȩ����Ȩ����Ĺ�ϵ
        auth5.setGroup(g3); //Ȩ����Ȩ����Ĺ�ϵ
        g1.setAuths(new Auth[]{auth1, auth2});
        g2.setAuths(new Auth[]{auth3, auth4});
        g3.setAuths(new Auth[]{auth5});
        //6.Ȩ�������ɫ��ϵ
        r1.setGroups(new Group[]{g1, g2, g3});
        r2.setGroups(new Group[]{g2, g3});
        g1.setRoles(new Role[]{r1});
        g2.setRoles(new Role[]{r1, r2});
        g3.setRoles(new Role[]{r1, r2});
        //7.�����û����ɫ�Ĺ�ϵ
        user1.setRole(r1);
        user2.setRole(r2);
        user3.setRole(r2);
        r1.setUsers(new User[]{user1});
        r2.setUsers(new User[]{user2, user3});
        //�ڶ���������Ҫ��ȡ������
        //���Ը���һ���û��������Ӧ�Ľ�ɫ�Լ�ÿ����ɫ��Ӧ��Ȩ�ޣ��Լ������ľ����Ȩ�����飻
        System.out.println(user1.toString());
        System.out.println("\t|- ����ɫ��" + user1.getRole().toString());
        for(int x = 0; x<user1.getRole().getGroups().length; x++){
            System.out.println("\t\t|- ��Ȩ���顿" + user1.getRole().getGroups()[x].toString());
            for(int y = 0;y<user1.getRole().getGroups()[x].getAuths().length; y++){
                System.out.println("\t\t\t|- ��Ȩ�ޡ�" + user1.getRole().getGroups()[x].getAuths()[y].toString());
            }
        }
        System.out.println("\n=============================================\n");
        //һ��Ȩ�޿�������߱���Ȩ�޵Ľ�ɫ���Լ��߱��˽�ɫ�������û���ͬʱ�����Ȩ�޵�����Ȩ�����飻
        System.out.println(auth1.toString());   //���һ��Ȩ����Ϣ
        //ͨ��Ȩ���ҵ���Ӧ��Ȩ���飬һ��Ȩ�����ж����ɫ
        for(int x =0;x<auth1.getGroup().getRoles().length;x++){
            System.out.println("\t|- ����ɫ��" + auth1.getGroup().getRoles()[x].toString());
            for(int y = 0;y<auth1.getGroup().getRoles()[x].getUsers().length;y++){
                System.out.println("\t\t|- ���û���" + auth1.getGroup().getRoles()[x].getUsers()[y].toString());
            }
        }
        System.out.println("\n=============================================\n");
        //һ����ɫ������������������û���ÿ���û���Ӧ�ľ����Ȩ�ޣ��Լ�Ȩ�����飻
        System.out.println(r1.toString());
        for(int x=0;x<r1.getUsers().length;x++){
            System.out.println("\t|- ���û���" + r1.getUsers()[x].toString());
            for(int y = 0;y<r1.getGroups().length;y++){
                System.out.println("\t\t|- ��Ȩ���顿" + r1.getGroups()[y].toString());
                for(int z = 0;z<r1.getGroups()[y].getAuths().length;z++){
                    System.out.println("\t\t\t|- ��Ȩ�ޡ�" + r1.getGroups()[y].getAuths()[z].toString());
                }
            }
        }
    }
}
