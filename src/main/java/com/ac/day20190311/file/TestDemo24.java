package com.ac.day20190311.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: java-basic
 * @description: BufferedReader类的使用
 * @author: Mr.Ao
 * @create: 2019-03-13 16:46
 **/
public class TestDemo24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while(flag){
            System.out.println("请输入年龄：");
            String str = br.readLine();
            if(str.matches("\\d+")){
                System.out.println("输入的信息为：" + str);
                flag = false;
            }else{
                System.out.println("请输入正确的年龄!");

            }
        }
    }
}
