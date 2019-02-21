package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * 引用静态方法
 */
@FunctionalInterface
interface IMessage2<P,R>{   //P表示参数类型，R表示返回值类型
    public R transform(P p);
}
public class TestDemo4 {
    public static void main(String[] args) {
        //以后调用IMessage接口中的transform()方法，就等价于String.valueOf()方法
        IMessage2<Double,String> msg = String :: valueOf;   //方法引用
        System.out.println(msg.transform(100.10001).replaceAll("0","9"));
    }
}
