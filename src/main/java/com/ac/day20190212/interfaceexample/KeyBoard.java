package com.ac.day20190212.interfaceexample;

/**
 * Created by aochong Cotter on 2019/2/14.
 * ����ʵ����
 */
public class KeyBoard implements USB{
    @Override
    public void start() {
        System.out.println("�����豸��ʼ������");
    }

    @Override
    public void stop() {
        System.out.println("�����豸ֹͣ������");
    }
}
