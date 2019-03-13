package com.ac.day20190311.file;

import java.io.*;

/**
 * @program: java-basic
 * @description: BufferedReader类的使用
 * @author: Mr.Ao
 * @create: 2019-03-13 16:46
 **/
public class TestDemo23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入文字：");
        String str = br.readLine();
        System.out.println("输入的信息为：" + str);
    }
}
