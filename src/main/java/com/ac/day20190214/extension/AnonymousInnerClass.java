package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * �����ʱ�����X����ֻʹ��һ�Σ���ô�б�Ҫ���䶨���һ��������������ô��ʱ����Ʋ�����
 */
interface A{
    public void printA();
}
class X implements A{
    @Override
    public void printA() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        A a = new X();
        a.printA();
    }
}
