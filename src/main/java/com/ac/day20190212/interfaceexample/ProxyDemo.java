package com.ac.day20190212.interfaceexample;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 代理设计模式案例
 */
interface Subject{
    public void get();
}
class RealSubject implements Subject{
    @Override
    public void get() {
        System.out.println("取回了被借走的钱！");
    }
}
class ProxySubject implements Subject{
    private Subject subject;
    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    public void prepare(){
        System.out.println("【讨债前准备】棍棒，皮鞭、绳子！");
    }

    @Override
    public void get() {
        this.prepare();
        this.subject.get();
        this.destory();
    }

    public void destory(){
        System.out.println("【讨债收尾】恐吓对方！");
    }
}
public class ProxyDemo {
    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());
        subject.get();
    }
}
