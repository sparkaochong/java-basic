package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo {
    public static void main(String[] args) {
        //��һ�����������еı�ṹ��������
        //1.׼�������еĶ����������
        Dept dept = new Dept(10, "ACCPUNTING", "NEW YORK");
        Emp empa = new Emp(7369, "SMITH", "CLERK", 800.0, 0.0);
        Emp empb = new Emp(7902, "FORD", "MANAGEER", 2450.0, 0.0);
        Emp empc = new Emp(7839, "KING", "PRESIDENT", 5000.0, 0.0);
        //2�����ñ˴˵Ĺ�ϵ
        //���ù�Ա���쵼�Ĺ�ϵ
        empa.setMgr(empb);  //���ù�Ա���쵼�Ĺ�ϵ
        empb.setMgr(empc);  //���ù�Ա���쵼�Ĺ�ϵ
        empa.setDept(dept); //���ù�Ա��������
        empb.setDept(dept); //���ù�Ա��������
        empc.setDept(dept); //���ù�Ա��������
        dept.setEmps(new Emp[]{empa, empb, empc});  //һ�����Ű��������Ա
        //�ڶ������������ݱ�ṹ��������ȡ������
        System.out.println(empa.toString());    //�����Ա������Ϣ
        System.out.println("\t|- ���쵼��Ϣ��" + empa.getMgr().toString());    //�����Ա�쵼������Ϣ
        System.out.println("\t|- ��������Ϣ��" + empa.getDept().toString());    //�����Ա�������Ż�����Ϣ
        System.out.println("\n=============================================================\n");
        System.out.println(dept.toString());    //���������Ϣ
        for(int x = 0; x<dept.getEmps().length; x++){
            System.out.println("\t|- ����Ա��Ϣ��" + dept.getEmps()[x].toString());
            if(dept.getEmps()[x].getMgr() != null){
                System.out.println("\t|- ����Ա�쵼��" + dept.getEmps()[x].getMgr().toString());
            }
        }
    }
}
