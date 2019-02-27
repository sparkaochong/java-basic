package com.ac.day20190227.thread;

/**
 * @program: java-basic
 * @description: 利用Object类解决数据重复问题
 * @author: Mr.Ao
 * @create: 2019-02-27 09:32
 **/
class Info2{
    private String title;
    private String content;
    private boolean flag = true;
    //flag = true ，表示可以生产数据，但是不能消费数据
    //flag = false，表示可以消费数据，但是不能生产数据

    public synchronized void set(String title,String content){
        if(this.flag == false){//表示已经生产过了，但是还没有消费
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.title = title;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false;
        super.notify();
    }

    public synchronized void get(){
        if(this.flag == true){//表示已经消费过了，但是还不能生产
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title + " --> " + this.content);
        this.flag = true;
        super.notify();
    }

    public Info2(){}

    public Info2(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
class Productor2 implements Runnable{
    private Info2 info2 = null;

    public Productor2(Info2 info2){
        this.info2 = info2;
    }

    @Override
    public void run() {
        for(int x=0;x<50;x++){
            if(x%2 == 0){
                this.info2.set("张三","一个帅哥");
            }else{
                this.info2.set("李四","一个懒人");
            }
        }
    }
}

class Consumer2 implements Runnable{
    private Info2 info2 = null;

    public Consumer2(Info2 info2){
        this.info2 = info2;
    }

    @Override
    public void run() {
        for(int x=0;x<50;x++){
            this.info2.get();
        }
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        Info2 info2 = new Info2();
        Productor2 pro2 = new Productor2(info2);
        Consumer2 con2 = new Consumer2(info2);
        new Thread(pro2).start();
        new Thread(con2).start();
    }
}
