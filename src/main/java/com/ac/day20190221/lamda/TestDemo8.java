package com.ac.day20190221.lamda;

import java.util.function.Function;

/**
 * Created by Chong Ao on 2019/2/21.
 * ���ù����ͺ���ʽ�ӿ�
 */
public class TestDemo8 {
    public static void main(String[] args) {
        Function<String,Boolean> f = "####hello" :: startsWith;
        System.out.println(f.apply("#"));
    }
}
