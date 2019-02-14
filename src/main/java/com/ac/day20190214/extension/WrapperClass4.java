package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * JDK1.5之后自动装箱与拆箱
 * Boolean与boolean
 */
public class WrapperClass4 {
    public static void main(String[] args) {
        Object obj = 100;   //转换：100自动装箱为Integer，Integer向上转型为Object
        int temp = (int)obj;     //向下转型为Integer，自动拆箱为int
        System.out.println(obj);
    }
}
