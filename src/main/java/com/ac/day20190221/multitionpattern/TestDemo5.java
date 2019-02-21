package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * 定义枚举其他结构
 */
enum Color5{
    RED("红色"),BLUE("蓝色"),GREEN("绿色"); //枚举对象必须写在首行
    private String title;   //定义属性
    private Color5(String title){   //构造方法必须私有化，使用非public
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        for(Color5 c:Color5.values()){
            System.out.println(c.name() + " -----> " + c.ordinal() + " -----> " + c);
        }
    }
}
