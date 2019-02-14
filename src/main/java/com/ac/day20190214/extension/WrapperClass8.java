package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * BooleanÓëbooleanÎªÀý
 */
public class WrapperClass8 {
    public static void main(String[] args) {
       String str = "100.3";
       boolean flag = Boolean.parseBoolean(str);
        if(flag){
            System.out.println("$$$$$$$$$$$$$$$");
        }else{
            System.out.println("####################");
        }
    }
}
