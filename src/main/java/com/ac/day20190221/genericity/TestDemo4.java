package com.ac.day20190221.genericity;

/**
 * Created by Chong Ao on 2019/2/21.
 * 模式一
 */
interface IMessage<T>{  //接口：IXxxxx、抽象类：abstractXxxx、普通类：直接写
    public void print(T t);
}
class MessageImpl<P> implements IMessage<P>{
    @Override
    public void print(P p) {
        System.out.println(p);
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        IMessage<String> msg = new MessageImpl<String>();
        msg.print("Hello!");
    }
}
