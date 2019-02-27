package com.ac.day20190227.thread;

/**
 * @program: java-basic
 * @description: 解决数据同步问题
 * @author: Mr.Ao
 * @create: 2019-02-27 09:32
 **/
class Info1{
    private String title;
    private String content;

    public synchronized void set(String title,String content){
        this.title = title;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
    }

    public synchronized void get(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title + " --> " + this.content);
    }

    public Info1(){}

    public Info1(String title, String content) {
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

    @Override
    public String toString() {
        return "Info{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
class Productor1 implements Runnable{
    private Info1 info = null;

    public Productor1(Info1 info){
        this.info = info;
    }

    @Override
    public void run() {
        for(int x=0;x<50;x++){
            if(x%2 == 0){
                this.info.set("张三","一个帅哥");
            }else{
                this.info.set("李四","一个懒人");
            }
        }
    }
}
class Consumer1 implements Runnable{
    private Info1 info = null;

    public Consumer1(Info1 info){
        this.info = info;
    }

    @Override
    public void run() {
        for(int x=0;x<50;x++){
            this.info.get();
        }
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Info1 info = new Info1();
        Productor1 pro = new Productor1(info);
        Consumer1 con = new Consumer1(info);
        new Thread(pro).start();
        new Thread(con).start();
    }
}
