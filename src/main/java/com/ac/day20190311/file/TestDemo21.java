package com.ac.day20190311.file;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: java-basic
 * @description: System实例化InputStream
 * @author: Mr.Ao
 * @create: 2019-03-13 16:46
 **/
public class TestDemo21 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        StringBuilder sb = new StringBuilder();
        System.out.println("请输入文字：");
        byte[] data = new byte[5];
        int temp = 0;
        while((temp = in.read()) != -1){
            if(temp == '\n'){
                break;
            }
            sb.append((char) temp);
        }
        System.out.println("输入信息为：" + sb);
    }
}
