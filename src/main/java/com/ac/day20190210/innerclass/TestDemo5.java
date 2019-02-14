package com.ac.day20190210.innerclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
class Outer1{
    private String info = "hello world";
    public void fun(){
        //����ǰ���󴫵ݵ��ڲ������
        Inner in = new Inner(this); //ʵ�����ڲ������
        in.print();
    }
    public String getInfo(){
        return info;
    }
}

class Inner{
    private Outer1 temp; //�˴�һ���������ⲿʵ�����õ�Outer����
    public Inner(Outer1 temp){
        this.temp = temp;
    }
    public void print(){
        //�˴���Ҫ�����ⲿ���˽�����ԣ����Բ��ܹ�ֱ��������ԣ���ҪOuter���ṩ��getter����
        //����Ӧ���ɶ��������ã�������Ҫ��ʵ��������
        //�൱���ⲿ��Outer��������getInfo()
        System.out.println(this.temp.getInfo());
    }
}

public class TestDemo5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun();
    }
}
