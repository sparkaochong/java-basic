package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * ��װ���ԭ��
 */
class MyInt{
    private int data;
    public MyInt(int data){ //��װ�䡿���췽��Ҫ����int����
        this.data = data;
    }
    public int intValue(){
        return this.data;   //�����䡿
    }
}
public class WrapperClass {
    public static void main(String[] args) {
        Object obj = new MyInt(10);
        MyInt m = (MyInt) obj;
        int temp = m.intValue();
        System.out.println(++ temp);
    }
}
