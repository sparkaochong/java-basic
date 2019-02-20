package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 * 断言
 */

public class AssertDemo {
    public static void main(String[] args) {
        int num = 10;
        //假设中间经过了三步计算
        assert num == 100 : "断言错误，num的内容不是100";
        System.out.println(num);
    }
}
