package com.ac.day20190311.file;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @program: java-basic
 * @description: System类实例化OutputStream
 * @author: Mr.Ao
 * @create: 2019-03-13 16:41
 **/
public class TestDemo19 {
    public static void main(String[] args) throws IOException {
        OutputStream out = System.out;
        out.write("Hello World!".getBytes());
        out.close();
    }
}
