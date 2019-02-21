package com.ac.day20190221.genericity;

/**
 * Created by Chong Ao on 2019/2/21.
 * ģʽ��
 */
interface IMessage1<T>{  //�ӿڣ�IXxxxx�������ࣺabstractXxxx����ͨ�ֱࣺ��д
    public void print(T t);
}
class MessageImpl1 implements IMessage1<String>{
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}

public class TestDemo5 {
    public static void main(String[] args) {
        IMessage1<String> msg = new MessageImpl1();
        msg.print("Hello!");
    }
}
