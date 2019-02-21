package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * 匿名内部类
 */
interface IMessage{
    public void print(String info);
}
public class TestDemo {
    public static void main(String[] args) {
        IMessage msg = new IMessage() {
            @Override
            public void print(String info) {
                System.out.println(info);
            }
        };
        msg.print("Hello 你好！");
    }
}
