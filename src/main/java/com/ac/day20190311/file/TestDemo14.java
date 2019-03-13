package com.ac.day20190311.file;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * @program: java-basic
 * @description: 文件合并
 * @author: Mr.Ao
 * @create: 2019-03-13 14:35
 **/
public class TestDemo14 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        String[] fileNames = new String[]{"hello.txt","hello1.txt"};
        for(int x = 0;x<fileNames.length;x++){
            InputStream in = new FileInputStream("E:" + File.separator + "File" + File.separator + fileNames[x]);
            int temp = 0 ;
            while((temp = in.read()) != -1){
                bos.write(temp);
            }
            in.close();
        }
        OutputStream out = new FileOutputStream("E:" + File.separator + "msg.txt");
        out.write(new String(bos.toByteArray()).toUpperCase().getBytes());
        out.close();
        bos.close();
    }
}
