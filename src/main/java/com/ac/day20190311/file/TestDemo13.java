package com.ac.day20190311.file;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * @program: java-basic
 * @description: 内存流操作
 * @author: Mr.Ao
 * @create: 2019-03-13 14:35
 **/
public class TestDemo13 {
    public static void main(String[] args) throws IOException {
        //实现小写操作
        String msg = "Hello World! . Very Good .";
        //将所有数据保存在内存流之中，利用ByteArrayInputStream
        InputStream in = new ByteArrayInputStream(msg.getBytes());
        //如果要通过内存读取数据，使用ByteOutputStream
        OutputStream out = new ByteOutputStream();
        //Character类提供了转大写或小写的一个方法:public static int toLowerCase(int codePoint)
        int temp = 0;
        while((temp = in.read()) != -1){
            out.write(Character.toLowerCase(temp));
        }
        System.out.println(out);
        in.close();
        out.close();
    }
}
