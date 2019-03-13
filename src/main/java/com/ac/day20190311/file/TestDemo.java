package com.ac.day20190311.file;

import java.io.File;

/**
 * @program: java-basic
 * @description: File类基本使用
 * @author: Mr.Ao
 * @create: 2019-03-11 19:33
 **/
public class TestDemo {
    public static void main(String[] args) throws Exception{
        //在设置路径的时候并不会判断文件的具体内容
        File file = new File("E:"+File.separator+"File"+File.separator+"test.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        if(file.exists()){
            file.delete();
        }else{
            System.out.println(file.createNewFile());
        }
    }
}
