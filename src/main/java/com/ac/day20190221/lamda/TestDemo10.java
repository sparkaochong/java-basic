package com.ac.day20190221.lamda;

import java.util.function.Supplier;

/**
 * Created by Chong Ao on 2019/2/21.
 * ���ù����ͺ���ʽ�ӿ�
 */
public class TestDemo10 {
    public static void main(String[] args) {
        Supplier<String> sup = "dog" :: toUpperCase;
        System.out.println(sup.get());
    }
}
