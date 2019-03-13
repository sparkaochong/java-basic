package com.ac.day20190311.file;

import java.io.File;

/**
 * @program: java-basic
 * @description: 目录列表
 * @author: Mr.Ao
 * @create: 2019-03-11 19:33
 **/
public class TestDemo3 {
    public static void main(String[] args) throws Exception{
        //在设置路径的时候并不会判断文件的具体内容
        File file = new File("E:"+File.separator);
        print(file);
    }

    public static void print(File file){
        if(file.isDirectory()){
            File[] result = file.listFiles();
            if(result!=null){
                for(int x=0;x<result.length;x++){
                    print(result[x]);
                }
            }

        }
        System.out.println(file);
    }
}
