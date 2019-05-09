package com.ac.day20190314.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @program: java-basic
 * @description: Iterator双向迭代
 * @author: Mr.Ao
 * @create: 2019-03-14 14:24
 **/
public class TestDemo5 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("hello");
        all.add("world");
        all.add("你好");
        all.add("世界");
        ListIterator<String> iter = all.listIterator();
        System.out.print("由前向后迭代：");
        while(iter.hasNext()){
            System.out.print(iter.next() + "、");
        }
        System.out.println();
        System.out.print("由后向前迭代：");
        while(iter.hasPrevious()){
            System.out.print(iter.previous() + "、");
        }
    }
}
