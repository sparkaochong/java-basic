package com.ac.day20190314.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: java-basic
 * @description: Iterator迭代输出
 * @author: Mr.Ao
 * @create: 2019-03-14 14:24
 **/
public class TestDemo4 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("hello");
        all.add("world");
        all.add("你好");
        all.add("世界");
        Iterator<String> iter = all.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            if("world".equals(str)){
//                all.remove(str);
                iter.remove();
            }else {
                System.out.println(str);
            }

        }
    }
}
