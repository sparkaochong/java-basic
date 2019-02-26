package com.ac.day20190226.thread;

/**
 * @program: java-basic
 * @description: �̵߳�����
 * @author: Mr.Ao
 * @create: 2019-02-26 20:40
 **/
public class TestDemo3{
    //���������ȶ�������final�Ķ�����.���Կ����ǹ��е���Դ.
    final Object lockA = new Object();
    final Object lockB = new Object();
    //������A
    class  ProductThreadA implements Runnable{
        @Override
        public void run() {
            //����һ��Ҫ���߳�˯һ�����ģ�⴦������ ,Ҫ��Ȼ�Ļ����������󲻻���ô������.�������ͬ����������,���Ȼ�ö�����lockA,Ȼ��ִ��һЩ����,���������Ҫ������lockBȥִ������һЩ����.
            synchronized (lockA){
                //����һ��log��־
                System.out.println("ThreadA lock  lockA");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockB){
                    //����һ��log��־
                    System.out.println("ThreadA lock  lockB");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
    //������B
    class  ProductThreadB implements Runnable{
        //����������˳����ú�������A�෴,����������Ҫ������lockB,Ȼ����Ҫ������lockA.
        @Override
        public void run() {
            synchronized (lockB){
                //����һ��log��־
                System.out.println("ThreadB lock  lockB");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockA){
                    //����һ��log��־
                    System.out.println("ThreadB lock  lockA");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
    public static void main(String[] args) {
        //���������߳�
        ProductThreadA productThreadA = new TestDemo3().new ProductThreadA();
        ProductThreadB productThreadB = new TestDemo3().new ProductThreadB();

        Thread threadA = new Thread(productThreadA);
        Thread threadB = new Thread(productThreadB);
        threadA.start();
        threadB.start();
    }
}
