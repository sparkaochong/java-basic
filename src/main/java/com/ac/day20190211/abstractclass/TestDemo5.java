package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 */
abstract class A5{//�������֮�����ǵ�N���ķ�չ����Ҫ�����࣬����N��ǰ����Ҫ
    public abstract void printA5();
    private static class B extends A5{
        @Override
        public void printA5() {
            System.out.println("Hello World!");
        }
    }
    public static A5 getInstance(){
        return new B();
    }
}
class C5 extends A5{
    @Override
    public void printA5() {
        System.out.println("************************");
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        A5 a = A5.getInstance();
        a.printA5();
        A5 a1 = new C5();   //�����û�����
        a1.printA5();
    }
}
