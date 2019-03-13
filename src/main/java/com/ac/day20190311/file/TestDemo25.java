package com.ac.day20190311.file;

import java.io.*;

/**
 * @program: java-basic
 * @description: BufferedReader读取文件
 * @author: Mr.Ao
 * @create: 2019-03-13 19:03
 **/
public class TestDemo25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("E:" + File.separator + "word.txt")));
        String str = null;
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
