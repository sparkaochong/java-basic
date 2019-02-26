package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * 模式一：枚举统一实现接口
 */
interface IMessage{
    public String getColor();
}
enum Color6 implements IMessage{
    RED("红色"),BLUE("蓝色"),GREEN("绿色"); //枚举对象必须写在首行
    private String title;   //定义属性
    private Color6(String title){   //构造方法必须私有化，使用非public
        this.title = title;
    }
    @Override
    public String toString(){
        return this.title;
    }

    @Override
    public String getColor() {
        return this.title;
    }
}
public class TestDemo6 {
    public static void main(String[] args) {
        IMessage msg = Color6.RED;
        System.out.println(msg.getColor());
    }
}
