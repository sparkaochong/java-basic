package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * ����ĳ������ķ���
 */
@FunctionalInterface
interface IMessage3<R>{
    public R upper();
}
public class TestDemo5 {
    public static void main(String[] args) {
        //�Ժ����IMessage�ӿ��е�upper()�������͵ȼ���String.toUpperCase()����
        IMessage3<String> msg = "Hello" :: toUpperCase;
        System.out.println(msg.upper());
    }
}
