package com.ac.day20190210.innerclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
class Outer1{
    private String info = "hello world";
    public void fun(){
        //将当前对象传递到内部类对象
        Inner in = new Inner(this); //实例化内部类对象
        in.print();
    }
    public String getInfo(){
        return info;
    }
}

class Inner{
    private Outer1 temp; //此处一个个接收外部实例化好的Outer对象
    public Inner(Outer1 temp){
        this.temp = temp;
    }
    public void print(){
        //此处需要访问外部类的私有属性，所以不能够直接输出属性，需要Outer类提供有getter方法
        //方法应该由对象来调用，所以需要有实例化对象
        //相当于外部的Outer类对象调用getInfo()
        System.out.println(this.temp.getInfo());
    }
}

public class TestDemo5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun();
    }
}
