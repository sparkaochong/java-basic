package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * ö���ж�����󷽷�
 */
enum Color8{
    RED("��ɫ"){
        public String getColor() {
            return "��ɫ";
        }
    },BLUE("��ɫ"){
        public String getColor() {
            return "��ɫ";
        }
    },GREEN("��ɫ"){
        public String getColor() {
            return "��ɫ";
        }
    }; //ö�ٶ������д������
    private String title;   //��������
    private Color8(String title){   //���췽������˽�л���ʹ�÷�public
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
    public abstract String getColor();
}
public class TestDemo8 {
    public static void main(String[] args) {
        System.out.println(Color8.BLUE.getColor());
    }
}
