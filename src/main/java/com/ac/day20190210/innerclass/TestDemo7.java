package com.ac.day20190210.innerclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
class Outer3{
    private String info = "Hello World!";
    public void fun(final int temp){
        final double sal = 9000.0;    //�����ж�����ͨ����
        class Inner{//�ڲ���
            public void print(){
                System.out.println("Outer���е�Info���ԣ�" + Outer3.this.info);
                System.out.println("fun()�����еĲ�����temp = " + temp);
                System.out.println("fun()�����ж������ʱ����temp = " + sal);
            }
        }
        new Inner().print();
    }
}
public class TestDemo7 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.fun(100);
    }
}
