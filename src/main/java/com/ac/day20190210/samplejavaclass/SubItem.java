package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class SubItem {
    private int sid;
    private String title;
    private String note;
    private Item item;

    public SubItem(){}

    public SubItem(int sid, String title, String note){
        this.sid = sid;
        this.title = title;
        this.note = note;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public Item getItem(){
        return this.item;
    }

    public void setSid(int sid){
        this.sid = sid;
    }

    public int getSid(){
        return this.sid;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setNote(String note){
        this.note = note;
    }

    public String getNote(){
        return this.note;
    }

    public String getInfo(){
        return "∑÷¿‡±‡∫≈£∫" + this.sid +
                " √˚≥∆£∫" + this.title +
                " ºÚΩÈ£∫" + this.note;
    }

}
