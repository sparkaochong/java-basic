package com.ac.day20190226.thread;

/**
 * @program: java-basic
 * @description: 线程的死锁
 * @author: Mr.Ao
 * @create: 2019-02-26 20:40
 **/
public class TestDemo3{
    //首先我们先定义两个final的对象锁.可以看做是共有的资源.
    final Object lockA = new Object();
    final Object lockB = new Object();
    //生产者A
    class  ProductThreadA implements Runnable{
        @Override
        public void run() {
            //这里一定要让线程睡一会儿来模拟处理数据 ,要不然的话死锁的现象不会那么的明显.这里就是同步语句块里面,首先获得对象锁lockA,然后执行一些代码,随后我们需要对象锁lockB去执行另外一些代码.
            synchronized (lockA){
                //这里一个log日志
                System.out.println("ThreadA lock  lockA");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockB){
                    //这里一个log日志
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
    //生产者B
    class  ProductThreadB implements Runnable{
        //我们生产的顺序真好好生产者A相反,我们首先需要对象锁lockB,然后需要对象锁lockA.
        @Override
        public void run() {
            synchronized (lockB){
                //这里一个log日志
                System.out.println("ThreadB lock  lockB");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockA){
                    //这里一个log日志
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
        //这里运行线程
        ProductThreadA productThreadA = new TestDemo3().new ProductThreadA();
        ProductThreadB productThreadB = new TestDemo3().new ProductThreadB();

        Thread threadA = new Thread(productThreadA);
        Thread threadB = new Thread(productThreadB);
        threadA.start();
        threadB.start();
    }
}
