package com.ac.day20190210.innerclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
class Outer{
    private String info = "hello world";
     class Inner{//�൱�ھ����ⲿ��
        private String msg = "�����ƽ";    //�ڲ���˽������
        public void print(){
            System.out.println(Outer.this.info);
        }
    }
    public void fun(){
        Inner in = new Inner();
        in.print();
        System.out.println(in.msg);
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun();
        Outer.Inner in = new Outer().new Inner();
        in.print();
    }
}
