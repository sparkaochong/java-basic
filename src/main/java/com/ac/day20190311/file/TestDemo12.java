package com.ac.day20190311.file;

import java.io.*;

/**
 * @program: java-basic
 * @description: 列出本机全部属性信息
 * @author: Mr.Ao
 * @create: 2019-03-13 14:35
 **/
public class TestDemo12 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:"+File.separator + "File" + File.separator + "test.txt");
        OutputStream out = new FileOutputStream(file);
        String msg = "方式分公司快快快还款计划计划科技";
        out.write(msg.getBytes("ISO8859-1"));
        out.close();
    }
}
