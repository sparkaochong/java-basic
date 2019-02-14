package com.ac.day20190212.interfaceexample;

/**
 * Created by aochong Cotter on 2019/2/14.
 * �������ģʽ����
 */
interface Subject{
    public void get();
}
class RealSubject implements Subject{
    @Override
    public void get() {
        System.out.println("ȡ���˱����ߵ�Ǯ��");
    }
}
class ProxySubject implements Subject{
    private Subject subject;
    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    public void prepare(){
        System.out.println("����ծǰ׼����������Ƥ�ޡ����ӣ�");
    }

    @Override
    public void get() {
        this.prepare();
        this.subject.get();
        this.destory();
    }

    public void destory(){
        System.out.println("����ծ��β�����ŶԷ���");
    }
}
public class ProxyDemo {
    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());
        subject.get();
    }
}
