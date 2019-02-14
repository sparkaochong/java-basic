package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo {
    public static void main(String[] args) {
        //第一步：根据已有的表结构设置数据
        //1.准备好所有的独立的类对象
        Dept dept = new Dept(10, "ACCPUNTING", "NEW YORK");
        Emp empa = new Emp(7369, "SMITH", "CLERK", 800.0, 0.0);
        Emp empb = new Emp(7902, "FORD", "MANAGEER", 2450.0, 0.0);
        Emp empc = new Emp(7839, "KING", "PRESIDENT", 5000.0, 0.0);
        //2：设置彼此的关系
        //设置雇员和领导的关系
        empa.setMgr(empb);  //设置雇员和领导的关系
        empb.setMgr(empc);  //设置雇员和领导的关系
        empa.setDept(dept); //设置雇员所属部门
        empb.setDept(dept); //设置雇员所属部门
        empc.setDept(dept); //设置雇员所属部门
        dept.setEmps(new Emp[]{empa, empb, empc});  //一个部门包含多个雇员
        //第二步：根据数据表结构利用引用取得数据
        System.out.println(empa.toString());    //输出雇员基本信息
        System.out.println("\t|- 【领导信息】" + empa.getMgr().toString());    //输出雇员领导基本信息
        System.out.println("\t|- 【部门信息】" + empa.getDept().toString());    //输出雇员所属部门基本信息
        System.out.println("\n=============================================================\n");
        System.out.println(dept.toString());    //输出部门信息
        for(int x = 0; x<dept.getEmps().length; x++){
            System.out.println("\t|- 【雇员信息】" + dept.getEmps()[x].toString());
            if(dept.getEmps()[x].getMgr() != null){
                System.out.println("\t|- 【雇员领导】" + dept.getEmps()[x].getMgr().toString());
            }
        }
    }
}
