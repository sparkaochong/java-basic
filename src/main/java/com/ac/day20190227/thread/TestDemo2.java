package com.ac.day20190227.thread;

/**
 * @program: java-basic
 * @description: ����Object���������ظ�����
 * @author: Mr.Ao
 * @create: 2019-02-27 09:32
 **/
class Info2{
    private String title;
    private String content;
    private boolean flag = true;
    //flag = true ����ʾ�����������ݣ����ǲ�����������
    //flag = false����ʾ�����������ݣ����ǲ�����������

    public synchronized void set(String title,String content){
        if(this.flag == false){//��ʾ�Ѿ��������ˣ����ǻ�û������
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
        if(this.flag == true){//��ʾ�Ѿ����ѹ��ˣ����ǻ���������
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
                this.info2.set("����","һ��˧��");
            }else{
                this.info2.set("����","һ������");
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
