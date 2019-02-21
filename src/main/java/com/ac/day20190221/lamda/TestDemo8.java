package com.ac.day20190221.lamda;

import java.util.function.Function;

/**
 * Created by Chong Ao on 2019/2/21.
 * 引用功能型函数式接口
 */
public class TestDemo8 {
    public static void main(String[] args) {
        Function<String,Boolean> f = "####hello" :: startsWith;
        System.out.println(f.apply("#"));
    }
}
