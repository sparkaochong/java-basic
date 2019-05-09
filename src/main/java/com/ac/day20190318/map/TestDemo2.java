package com.ac.day20190318.map;

import java.util.*;

/**
 * @program: java-basic
 * @description: TreeMap的使用
 * @author: Mr.Ao
 * @create: 2019-03-18 16:25
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"一");
        map.put(9,"九");
        map.put(3,"三");
        System.out.println(map);
    }
}
