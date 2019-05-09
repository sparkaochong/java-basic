package com.ac.day20190314.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @program: java-basic
 * @description: List的使用
 * @author: Mr.Ao
 * @create: 2019-03-14 10:34
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("hello");
        list.addLast("傻子");
        list.add("world");
        list.addFirst("呆子");
        list.push("fskjhj");
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.pop());
    }
}
