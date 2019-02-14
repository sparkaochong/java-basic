package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 装箱与拆箱
 */
public class WrapperClass1 {
    public static void main(String[] args) {
        Integer x = new Integer(10);    //装箱操作
        int temp = x.intValue();    //拆箱操作
    }
}
