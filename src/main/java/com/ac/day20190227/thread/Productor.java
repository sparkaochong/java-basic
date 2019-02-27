package com.ac.day20190227.thread;

/**
 * @program: java-basic
 * @description: ������ģ��
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
                this.info.setTitle("����");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("һ��˧��");
            }else{
                this.info.setTitle("����");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("һ������");
            }
        }
    }
}
