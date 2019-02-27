package com.ac.day20190227.thread;

/**
 * @program: java-basic
 * @description: 生产者模型
 * @author: Mr.Ao
 * @create: 2019-02-27 09:10
 **/
public class Productor implements Runnable{
    private Info info = null;

    public Productor(){}

    public Productor(Info info){
        this.info = info;
    }

    @Override
    public void run() {
        for(int x =0;x<50;x++){
            if(x % 2 ==0){
                this.info.setTitle("张三");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("一个帅哥");
            }else{
                this.info.setTitle("李四");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("一个懒人");
            }
        }
    }
}
