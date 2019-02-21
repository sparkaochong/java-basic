package com.ac.day20190221.genericity;

/**
 * Created by Chong Ao on 2019/2/21.
 * Í¨Åä·û
 */
class Message<T>{
    private T info;

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Message<String> msg = new Message<String>();
        msg.setInfo("100");
        fun(msg);
    }

    public static void fun(Message<? super String> info){
        System.out.println(info.getInfo());
    }
}
