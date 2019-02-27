package com.ac.day20190227.math;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: java-basic
 * @description: 36选7案例
 * @author: Mr.Ao
 * @create: 2019-02-27 19:41
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        int[] temp = new int[7];
        ch(temp);
        Arrays.sort(temp);
        print(temp);
    }

    public static void print(int[] temp){
        for(int x=0;x<temp.length;x++){
            System.out.print(temp[x] + "、");
        }
    }

    /**
     * 生成7个37以内的随机整数，并且这七个整数不能有重复，不能有0
     * @param temp  随机整数保存数组
     */
    public static void ch(int[] temp){
        int foot = 0;
        Random rand = new Random();
        while(foot < 7){
            int num = rand.nextInt(37);
            if(num != 0 && !isRepeat(temp,num)){
                temp[foot++] = num;
            }
        }
    }

    /**
     * 判断数字是否存在
     * @param temp  判断的数组数据
     * @param num   生成的随机整数
     * @return  如果存在返回true，否则返回false
     */
    public static boolean isRepeat(int temp[],int num){
        for(int x=0;x<temp.length;x++){
            if(num == temp[x]){
                return true;
            }
        }
        return false;
    }
}
