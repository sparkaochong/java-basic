package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * ����ö�������ṹ
 */
enum Color5{
    RED("��ɫ"),BLUE("��ɫ"),GREEN("��ɫ"); //ö�ٶ������д������
    private String title;   //��������
    private Color5(String title){   //���췽������˽�л���ʹ�÷�public
        this.title = title;
    }
    @Override
    public String toString(){
        return this.title;
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        for(Color5 c:Color5.values()){
            System.out.println(c.name() + " -----> " + c.ordinal() + " -----> " + c);
        }
    }
}
