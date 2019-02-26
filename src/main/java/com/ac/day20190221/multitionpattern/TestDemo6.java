package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * ģʽһ��ö��ͳһʵ�ֽӿ�
 */
interface IMessage{
    public String getColor();
}
enum Color6 implements IMessage{
    RED("��ɫ"),BLUE("��ɫ"),GREEN("��ɫ"); //ö�ٶ������д������
    private String title;   //��������
    private Color6(String title){   //���췽������˽�л���ʹ�÷�public
        this.title = title;
    }
    @Override
    public String toString(){
        return this.title;
    }

    @Override
    public String getColor() {
        return this.title;
    }
}
public class TestDemo6 {
    public static void main(String[] args) {
        IMessage msg = Color6.RED;
        System.out.println(msg.getColor());
    }
}
