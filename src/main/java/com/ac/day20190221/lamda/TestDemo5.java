package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * 引用某个对象的方法
 */
@FunctionalInterface
interface IMessage3<R>{
    public R upper();
}
public class TestDemo5 {
    public static void main(String[] args) {
        //以后调用IMessage接口中的upper()方法，就等价于String.toUpperCase()方法
        IMessage3<String> msg = "Hello" :: toUpperCase;
        System.out.println(msg.upper());
    }
}
