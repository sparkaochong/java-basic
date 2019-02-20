package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 比较问题
 */
public class WrapperClass6 {
    public static void main(String[] args) {
       String str = "100";
       int num = Integer.parseInt(str);
//       Integer x2 = x1;
       Integer x2 = 100;
       Integer x3 = new Integer(100);
        System.out.println(num == x2);  //true
        System.out.println(x2 == x3);  //false
        System.out.println(num == x3);  //true
        System.out.println(num == x3);  //true
        System.out.println(x2.equals(x3));  //true
    }
}
