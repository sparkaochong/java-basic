package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
abstract class A1{
    public A1(){//2.Ĭ�ϵ��ø��๹�췽��
        this.print();//3.���ñ���print()����
    }
    public abstract void print();
}
class B1 extends A1{
    private int num = 50;
    public B1(int num){//1.�������ݹ��������������ʵ����ǰ��ʵ�����������
        this.num = num;
    }
    @Override
    public void print() {//4.���ô˷���ִ�У����Ǵ�ʱ�������û��ʵ����������û�б���ֵ
        System.out.println("num = " + this.num);//5.ֻ�ܹ������Ӧ�������͵�Ĭ��ֵ
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        new B(100);
    }
}
