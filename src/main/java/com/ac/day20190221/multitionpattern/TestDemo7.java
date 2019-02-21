package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * ģʽ����ö�ٶ�����������ڲ���ķ�ʽʵ�ֽӿ�
 */
interface IMessage1{
    public String getColor();
}
enum Color7 implements IMessage1{
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
    private Color7(String title){   //���췽������˽�л���ʹ�÷�public
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
}
public class TestDemo7 {
    public static void main(String[] args) {
        IMessage1 msg = Color7.RED;
        System.out.println(msg.getColor());
    }
}
