package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * ʹ�������ڲ���
 */
interface A1{
    public void printA();
}
public class AnonymousInnerClass1 {
    public static void main(String[] args) {
        A a = new X(){
            @Override
            public void printA() {
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            }
        };
        a.printA();
    }
}
