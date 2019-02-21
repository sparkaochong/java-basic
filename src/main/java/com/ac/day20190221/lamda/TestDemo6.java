package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * 引用某个对象的方法
 */
@FunctionalInterface
interface IMessage4<P,R>{
    public R compare(P p1,P p2);
}
public class TestDemo6 {
    public static void main(String[] args) {
        IMessage4<String, Integer> msg = String :: compareTo;
        System.out.println(msg.compare("A","B"));   //"A".compareTo("B")
    }
}
