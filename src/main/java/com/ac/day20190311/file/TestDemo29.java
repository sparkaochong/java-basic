package com.ac.day20190311.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @program: java-basic
 * @description: Scanner类读取文件
 * @author: Mr.Ao
 * @create: 2019-03-13 19:19
 **/
public class TestDemo29 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileInputStream(new File("E:" + File.separator + "word.txt")));
        sc.useDelimiter("\n");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();
    }
}
