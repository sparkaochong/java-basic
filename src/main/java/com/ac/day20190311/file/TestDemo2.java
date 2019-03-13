package com.ac.day20190311.file;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: java-basic
 * @description: File类列出目录
 * @author: Mr.Ao
 * @create: 2019-03-11 19:33
 **/
public class TestDemo2 {
    public static void main(String[] args) throws Exception{
        //在设置路径的时候并不会判断文件的具体内容
        File file = new File("E:"+File.separator);
        if(file.exists() && file.isDirectory()){
            File[] result = file.listFiles();
            for(int x=0;x<result.length;x++){
                System.out.println(result[x]);
            }
        }
    }
}
