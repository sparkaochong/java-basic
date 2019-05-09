package com.ac.day20190318.map;

import java.util.*;

/**
 * @program: java-basic
 * @description: Hashtable的使用
 * @author: Mr.Ao
 * @create: 2019-03-18 16:25
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new Hashtable<>();
        map.put("fas",1);
        map.put("smith",30);
        map.put("fsafs",28);
        map.put("fsafs",28);
        map.put("empty",null);
        map.put(null,0);
        Set<String> set = map.keySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
