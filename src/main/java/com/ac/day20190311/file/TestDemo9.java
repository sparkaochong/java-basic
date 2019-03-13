package com.ac.day20190311.file;

import java.io.*;

/**
 * @program: java-basic
 * @description: FileReader实现文件读取
 * @author: Mr.Ao
 * @create: 2019-03-11 19:33
 **/
public class TestDemo9 {
    public static void main(String[] args) throws Exception{
        File file = new File("E:"+File.separator + "File" + File.separator + "test.txt");
        if(file.exists()){
            Reader in = new FileReader(file);
            char[] data = new char[1024];
            int len = in.read(data);
            System.out.println(new String(data,0,len));
            in.close();
        }
    }
}
