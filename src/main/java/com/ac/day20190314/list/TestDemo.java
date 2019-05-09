package com.ac.day20190314.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

/**
 * @program: java-basic
 * @description: List的使用
 * @author: Mr.Ao
 * @create: 2019-03-14 10:34
 **/
public class TestDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("是否为空：" + list.isEmpty());
        System.out.println("数据个数：" + list.size());
        list.add("hello");
        list.add("hello");
        list.add("world");
        for(int x = 0;x<list.size();x++){
            System.out.println(list.get(x));
        }
        System.out.println("是否为空：" + list.isEmpty());
        System.out.println("数据个数：" + list.size());
        System.out.println(list);
    }
}
