package com.ac.day20190311.file;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * @program: java-basic
 * @description: 文件拷贝
 * @author: Mr.Ao
 * @create: 2019-03-13 13:50
 **/
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //如果要执行拷贝命令，则必须通过初始化参数传递源文件路径以及目标文件路径
        if(args.length != 2){
            System.out.println("错误的命令，格式为：CopyDemo 源文件路径 目标文件路径");
            System.exit(1);
        }
        //如果现在有参数了，还需要验证源文件是否存在
        File sourcePath = new File(args[0]);
        if(!sourcePath.exists()){
            System.out.println("路径错误，请确定源文件路径");
            System.exit(1);
        }
        //如果拷贝文件存在
        File targetPath = new File(args[1]);
        if(targetPath.exists()){
            System.out.println("拷贝的路径以及存在，请更换目标路径");
            System.exit(1);
        }
        long start = System.currentTimeMillis();
        InputStream in = new FileInputStream(sourcePath);
        OutputStream out = new FileOutputStream(targetPath);
        copy(in,out);
        System.out.println("拷贝时长：" + (System.currentTimeMillis() - start)/1000 + "秒");
    }

    public static void copy(InputStream inFile, OutputStream outFile) throws IOException {
        int temp = 0;
        byte[] data = new byte[2048];
        while((temp = inFile.read(data)) != -1){
            outFile.write(data,0,temp);
        }
    }
}
