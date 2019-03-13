package com.ac.day20190311.file;

import java.io.*;

/**
 * @program: java-basic
 * @description: OutputStreamWriter实现转型操作
 * @author: Mr.Ao
 * @create: 2019-03-11 19:33
 **/
public class TestDemo10 {
    public static void main(String[] args) throws Exception{
        File file = new File("E:"+File.separator + "File" + File.separator + "test.txt");
        if(file.exists()){
            OutputStream out = new FileOutputStream(file);
            Writer  writer = new OutputStreamWriter(out);
            String msg = "Hello World!!!";
            writer.write(msg);
            writer.close();
            out.close();
        }
    }
}
