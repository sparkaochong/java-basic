package com.ac.day20190214.objectclass;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 利用Object类接收接口
 */
interface A1{
    public void printA1();
}
class X1 extends Object implements A1{
    @Override
    public void printA1() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
public class TestDemo6 {
    public static void main(String[] args) {
        A1 a = new X1();    //向上转型
        Object obj = a;     //向上转型
        A1 temp = (A1)obj;  //向下转型
        temp.printA1();
    }
}
