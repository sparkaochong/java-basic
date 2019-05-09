package com.ac.day20190318.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: java-basic
 * @description: HashMap的基本使用
 * @author: Mr.Ao
 * @create: 2019-03-18 16:25
 **/
public class TestDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("fas",1);
        map.put("smith",30);
        map.put("fsafs",28);
        map.put("fsafs",28);
        map.put("empty",null);
        map.put(null,0);
        System.out.println(map.get("fas"));
        System.out.println(map.get("hello"));
        System.out.println(map.get(null));
        Set<String> set = map.keySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
