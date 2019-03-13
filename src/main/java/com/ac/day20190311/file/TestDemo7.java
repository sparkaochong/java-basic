package com.ac.day20190311.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @program: java-basic
 * @description: InputStream实现文件读取
 * @author: Mr.Ao
 * @create: 2019-03-11 19:33
 **/
public class TestDemo7 {
    public static void main(String[] args) throws Exception{
        //第一步：定义要输出文件的File类对象
        File file = new File("E:"+File.separator + "File" + File.separator + "test.txt");
        //第二步：利用OutputStream的子类为父类进行实例化
        InputStream input = new FileInputStream(file);
        //第三步：实现数据的读取操作
        byte[] data = new byte[1024];
        int foot = 0;
        int temp = 0;
        while((temp = input.read()) != -1){
            data[foot++] = (byte) temp;
        }
        System.out.println("读取的内容【"+new String(data,0,foot)+"】");
        input.close();
    }
}
