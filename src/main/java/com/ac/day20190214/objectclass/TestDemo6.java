package com.ac.day20190214.objectclass;

/**
 * Created by aochong Cotter on 2019/2/14.
 * ����Object����սӿ�
 */
interface A1{
    public void printA1();
}
class X1 extends Object implements A1{
    @Override
    public void printA1() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
public class TestDemo6 {
    public static void main(String[] args) {
        A1 a = new X1();    //����ת��
        Object obj = a;     //����ת��
        A1 temp = (A1)obj;  //����ת��
        temp.printA1();
    }
}
