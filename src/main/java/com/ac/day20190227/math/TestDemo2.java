package com.ac.day20190227.math;

import java.util.Random;

/**
 * @program: java-basic
 * @description: Random方法的使用
 * @author: Mr.Ao
 * @create: 2019-02-27 19:28
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        Random rand = new Random(456);
        for(int x=0;x<10;x++){
            System.out.println(rand.nextInt(100) + "、" + x);
        }
    }
}
