package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * JDK1.5֮���Զ�װ�������
 * Boolean��boolean
 */
public class WrapperClass4 {
    public static void main(String[] args) {
        Object obj = 100;   //ת����100�Զ�װ��ΪInteger��Integer����ת��ΪObject
        int temp = (int)obj;     //����ת��ΪInteger���Զ�����Ϊint
        System.out.println(obj);
    }
}
