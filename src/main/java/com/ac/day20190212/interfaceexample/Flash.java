package com.ac.day20190212.interfaceexample;

/**
 * Created by aochong Cotter on 2019/2/14.
 * U���豸ʵ����
 */
public class Flash implements USB{
    @Override
    public void start() {
        System.out.println("U���豸��ʼ����");
    }

    @Override
    public void stop() {
        System.out.println("U���豸ֹͣ����");
    }
}
