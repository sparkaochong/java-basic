package com.ac.day20190221.lamda;

import java.util.function.Consumer;

/**
 * Created by Chong Ao on 2019/2/21.
 * ���������ͺ���ʽ�ӿ�
 */
public class TestDemo9 {
    public static void main(String[] args) {
        Consumer<String> cons = System.out :: println;
        cons.accept("�����....");
    }
}
