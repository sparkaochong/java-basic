package com.ac.day20190227.thread;

/**
 * @program: java-basic
 * @description:
 * @author: Mr.Ao
 * @create: 2019-02-27 09:13
 **/
public class Consumer implements Runnable{
    private Info info = null;

    public Consumer(){}

    public Consumer(Info info){
        this.info = info;
    }

    @Override
    public void run() {
        for(int x=0;x<50;x++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.info.getTitle() + " ---> " + this.info.getContent());
        }
    }
}
