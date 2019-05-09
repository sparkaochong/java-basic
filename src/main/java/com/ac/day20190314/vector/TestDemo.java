package com.ac.day20190314.vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * @program: java-basic
 * @description: Enumeration迭代输出
 * @author: Mr.Ao
 * @create: 2019-03-14 15:02
 **/
public class TestDemo {
    public static void main(String[] args) {
        Vector<String> all = new Vector<>();
        all.add("hello");
        all.add("world");
        all.add("你好");
        all.add("世界");
        Enumeration enu = all.elements();
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }
    }
}
