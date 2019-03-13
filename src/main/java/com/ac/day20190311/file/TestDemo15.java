package com.ac.day20190311.file;

import java.io.*;

/**
 * @program: java-basic
 * @description: 打印流
 * @author: Mr.Ao
 * @create: 2019-03-13 15:41
 **/
class PrintUtil{
    private OutputStream output;

    public PrintUtil(OutputStream output){
        this.output = output;
    }

    public void print(String str){
        try {
            this.output.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print(int i){
        this.print(String.valueOf(i));
    }
    public void print(double d){
        this.print(String.valueOf(d));
    }
    public void println(String str){
        this.print(str + "\n");
    }
    public void println(int i){
        this.println(String.valueOf(i));
    }
    public void println(double d){
        this.println(String.valueOf(d));
    }

    public void close(){
        try {
            this.output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class TestDemo15 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream pu = new PrintStream(new FileOutputStream(new File("E:" + File.separator + "message.txt")));
        pu.println("Hello World!");
        pu.print("我的名字：");
        pu.print("敖翀");
        pu.print("年龄：");
        pu.print("24");
        pu.close();
    }
}
