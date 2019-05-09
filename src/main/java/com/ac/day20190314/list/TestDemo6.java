package com.ac.day20190314.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @program: java-basic
 * @description: foreach输出
 * @author: Mr.Ao
 * @create: 2019-03-14 14:24
 **/
public class TestDemo6 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("hello");
        all.add("world");
        all.add("你好");
        all.add("世界");
        for (String s:all
             ) {
            System.out.println(s);
        }
    }
}
