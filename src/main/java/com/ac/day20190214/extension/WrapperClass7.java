package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * DoubleÓëdoubleÎªÀı
 */
public class WrapperClass7 {
    public static void main(String[] args) {
       String str = "100.3";
//       String str = "100afsad";     //±¨´í
//       String str = "100";
       Double d = Double.parseDouble(str);
       System.out.println(++ d);
    }
}
