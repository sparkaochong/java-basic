package com.ac.day20190303.regex;

/**
 * @program: java-basic
 * @description: 判断字符串是否由数字所组成
 * @author: Mr.Ao
 * @create: 2019-03-03 16:15
 **/
public class TestDemo {
    public static void main(String[] args) {
        String str = "12387aa6465";
        System.out.println(isNumber(str));
    }
    public static boolean isNumber(String data){
        char[] result = data.toCharArray();
        for(int x=0;x<result.length;x++){
            if(result[x]<'0' || result[x]>'9'){
                return false;
            }
        }
        return true;
    }
}
