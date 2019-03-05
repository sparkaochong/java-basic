package com.ac.day20190305.international;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @program: java-basic
 * @description: 读取资源文件
 * @author: Mr.Ao
 * @create: 2019-03-05 18:53
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        //设置资源文件的名称，但是没有后缀，资源文件保存在CLASSPATH之中
        ResourceBundle rb = ResourceBundle.getBundle("Message",locale);
        String str = rb.getString("welcome.info");
        System.out.println(MessageFormat.format(str,"SMITH"));
    }
}
