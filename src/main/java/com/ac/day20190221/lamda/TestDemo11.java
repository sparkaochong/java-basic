package com.ac.day20190221.lamda;

import java.util.function.Predicate;

/**
 * Created by Chong Ao on 2019/2/21.
 * ���ö����ͺ���ʽ�ӿ�
 */
public class TestDemo11 {
    public static void main(String[] args) {
        Predicate<Object> pre = "hello" :: equals;
        System.out.println(pre.test("hello"));
    }
}
