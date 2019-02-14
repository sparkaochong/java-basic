package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
abstract class A1{
    public A1(){//2.默认调用父类构造方法
        this.print();//3.调用本类print()方法
    }
    public abstract void print();
}
class B1 extends A1{
    private int num = 50;
    public B1(int num){//1.传递内容过来，在子类对象实例化前先实例化父类对象
        this.num = num;
    }
    @Override
    public void print() {//4.调用此方法执行，但是此时子类对象还没有实例化，内容没有被赋值
        System.out.println("num = " + this.num);//5.只能够输出对应数据类型的默认值
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        new B(100);
    }
}
