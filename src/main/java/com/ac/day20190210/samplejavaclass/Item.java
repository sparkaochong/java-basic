package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class Item {
    private int iid;
    private String title;
    private String note;
    private SubItem[] subitems;

    public Item(){}

    public Item(int iid, String title, String note){
        this.iid = iid;
        this.title = title;
        this.note = note;
    }

    public void setSubitems(SubItem[] subitems){
        this.subitems = subitems;
    }

    public SubItem[] getSubitems(){
        return this.subitems;
    }

    public void setIid(int iid){
        this.iid = iid;
    }

    public int getIiid(){
        return this.iid;
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
        return "∑÷¿‡±‡∫≈£∫" + this.iid +
                " √˚≥∆£∫" + this.title +
                " ºÚΩÈ£∫" + this.note;
    }
}
