package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * Lamda表达式
 */
@FunctionalInterface
interface IMath{
    public int add(int x,int y);
}
public class TestDemo2 {
    public static void main(String[] args) {
        IMath msg = (a,b) -> {
            int result = a + b;
            System.out.println("第一个数字：" + a);
            System.out.println("第二个数字：" + b);
            System.out.println("输出结果：" + result);
            return result;
        };
        System.out.println(msg.add(10,56));
    }
}
