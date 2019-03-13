package com.ac.day20190311.file;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: java-basic
 * @description: File类基本使用
 * @author: Mr.Ao
 * @create: 2019-03-11 19:33
 **/
public class TestDemo1 {
    public static void main(String[] args) throws Exception{
        //在设置路径的时候并不会判断文件的具体内容
        File file = new File("E:"+File.separator+"3D_Tiles_1.0.pdf");
        if(file.exists()){
            System.out.println("是否为目录？" + file.isDirectory());
            System.out.println("是否为文件？" + file.isFile());
            System.out.println("文件大小：" + new BigDecimal((double)file.length()/1024/1024).divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP) + "MB");
            System.out.println("最近的修改日期：" + new SimpleDateFormat("yyyy-MM-dd HH:ss:SSS").format(new Date(file.lastModified())));
        }
    }
}
