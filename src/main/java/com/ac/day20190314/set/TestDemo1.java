package com.ac.day20190314.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @program: java-basic
 * @description: TreeSet的使用
 * @author: Mr.Ao
 * @create: 2019-03-14 12:02
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Set<String> all = new TreeSet<String>();
        all.add("hello");
        all.add("hello");
        all.add("world");
        all.add("world");
        System.out.println(all);
    }
}
