package com.ac.day20190210.innerclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
class Outer3{
    private String info = "Hello World!";
    public void fun(final int temp){
        final double sal = 9000.0;    //方法中定义普通属性
        class Inner{//内部类
            public void print(){
                System.out.println("Outer类中的Info属性：" + Outer3.this.info);
                System.out.println("fun()方法中的参数，temp = " + temp);
                System.out.println("fun()方法中定义的临时变量temp = " + sal);
            }
        }
        new Inner().print();
    }
}
public class TestDemo7 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.fun(100);
    }
}
