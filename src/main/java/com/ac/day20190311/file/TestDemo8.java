package com.ac.day20190311.file;

import java.io.*;

/**
 * @program: java-basic
 * @description: FileWriter实现文件输出
 * @author: Mr.Ao
 * @create: 2019-03-11 19:33
 **/
public class TestDemo8 {
    public static void main(String[] args) throws Exception{
        File file = new File("E:"+File.separator + "File" + File.separator + "test.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        Writer writer = new FileWriter(file,true);
        String msg = "发噶数控技术卡萨覅粉红色会计法还是我刚刚\r\n";
        writer.write(msg);
        writer.flush();
//        writer.close();
    }
}
