package com.ac.day20190221.lamda;

/**
 * Created by Chong Ao on 2019/2/21.
 * ���þ�̬����
 */
@FunctionalInterface
interface IMessage2<P,R>{   //P��ʾ�������ͣ�R��ʾ����ֵ����
    public R transform(P p);
}
public class TestDemo4 {
    public static void main(String[] args) {
        //�Ժ����IMessage�ӿ��е�transform()�������͵ȼ���String.valueOf()����
        IMessage2<Double,String> msg = String :: valueOf;   //��������
        System.out.println(msg.transform(100.10001).replaceAll("0","9"));
    }
}
