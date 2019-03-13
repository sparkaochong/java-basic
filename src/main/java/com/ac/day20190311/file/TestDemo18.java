package com.ac.day20190311.file;

/**
 * @program: java-basic
 * @description: System类输出支持
 * @author: Mr.Ao
 * @create: 2019-03-13 16:36
 **/
public class TestDemo18 {
    public static void main(String[] args) {
        try{
            Integer.parseInt("你是一只狗");
        }catch(Exception e){
            System.err.println(e);
            System.out.println(e);
        }
    }
}
