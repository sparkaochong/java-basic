package com.ac.day20190314.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @program: java-basic
 * @description: List的使用
 * @author: Mr.Ao
 * @create: 2019-03-14 10:34
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        Object obj[] = list.toArray();
        for(int x=0;x<obj.length;x++){
            System.out.println(obj[x]);
        }
    }
}
