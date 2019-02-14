package com.ac.day20190214.extension;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 包装类的原理
 */
class MyInt{
    private int data;
    public MyInt(int data){ //【装箱】构造方法要接收int数据
        this.data = data;
    }
    public int intValue(){
        return this.data;   //【拆箱】
    }
}
public class WrapperClass {
    public static void main(String[] args) {
        Object obj = new MyInt(10);
        MyInt m = (MyInt) obj;
        int temp = m.intValue();
        System.out.println(++ temp);
    }
}
