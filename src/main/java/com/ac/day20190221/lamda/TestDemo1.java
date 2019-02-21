package com.ac.day20190221.lamda;

import jdk.nashorn.internal.objects.annotations.Function;

/**
 * Created by Chong Ao on 2019/2/21.
 * Lamda���ʽ
 */
@FunctionalInterface
interface IMessage1{
    public void print(String info);
}
public class TestDemo1 {
    public static void main(String[] args) {
        IMessage1 msg = (info) -> System.out.println(info);
        msg.print("Hello ��ã�");
    }
}
