package com.ac.day20190311.file;

/**
 * @program: java-basic
 * @description: 字符串格式化
 * @author: Mr.Ao
 * @create: 2019-03-13 16:24
 **/
public class TestDemo17 {
    public static void main(String[] args) {
        String name = "张三";
        int age = 20;
        double score = 59.356;
        String str = String.format("姓名：%s, 年龄：%d, 分数： %5.2f",name,age,score);
        System.out.println(str);
    }
}
