package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * Lamda���ʽ
 */
@FunctionalInterface
interface IMath{
    public int add(int x,int y);
}
public class TestDemo2 {
    public static void main(String[] args) {
        IMath msg = (a,b) -> {
            int result = a + b;
            System.out.println("��һ�����֣�" + a);
            System.out.println("�ڶ������֣�" + b);
            System.out.println("��������" + result);
            return result;
        };
        System.out.println(msg.add(10,56));
    }
}
