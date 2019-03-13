package com.ac.day20190311.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @program: java-basic
 * @description: OutputStream实现文件输出
 * @author: Mr.Ao
 * @create: 2019-03-11 19:33
 **/
public class TestDemo4 {
    public static void main(String[] args) throws Exception{
        //第一步：定义要输出文件的File类对象
        File file = new File("E:"+File.separator + "File" + File.separator + "test.txt");
        //第二步：利用OutputStream的子类为父类进行实例化
        OutputStream output = new FileOutputStream(file,true);
        //第三步：输出文字信息
        String msg = "按施工的高科技的时刻是会是加快结婚不看机会\r\n";
        //为了方便输出需要将字符串变为字节数组
        byte[] data = msg.getBytes();
        for(int x=0;x<data.length;x++){
            output.write(data[x]);
        }
//        output.close();
    }
}
