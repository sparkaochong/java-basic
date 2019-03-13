package com.ac.day20190311.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @program: java-basic
 * @description: 格式化输出
 * @author: Mr.Ao
 * @create: 2019-03-13 16:18
 **/
public class TestDemo16 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream pu = new PrintStream(new FileOutputStream(new File("E:" + File.separator + "test.txt")));
        String name = "张三";
        int age = 10;
        double score = 59.356;
        pu.printf("姓名：%s, 年龄：%d, 分数：%5.2f",name,age,score);
        pu.close();
    }
}
