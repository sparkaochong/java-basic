package com.ac.day20190311.file;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: java-basic
 * @description: System实例化InputStream
 * @author: Mr.Ao
 * @create: 2019-03-13 16:46
 **/
public class TestDemo20 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        System.out.println("请输入文字：");
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println("输入信息为：" + new String(data,0,len));
    }
}
