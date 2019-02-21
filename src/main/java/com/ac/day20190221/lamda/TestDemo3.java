package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * Lamda±í´ïÊ½
 */
@FunctionalInterface
interface IMath1{
    public int add(int x, int y);
}
public class TestDemo3 {
    public static void main(String[] args) {
        IMath msg = (a,b) -> a + b;
        System.out.println(msg.add(10,56));
    }
}
